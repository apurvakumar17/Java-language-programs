let boxes = document.querySelectorAll(".box");
let resetBtn = document.querySelector("#reset-btn");
let newGameBtn = document.querySelector("#new-btn");
let msgContainer = document.querySelector(".msg-container");
let msg = document.querySelector("#msg");

let count = 0;
let compArr = Array.from(boxes);
let randomEle = "";
let gameOver = false;

const winPatters = [
    [0, 1, 2],
    [0, 3, 6],
    [0, 4, 8],
    [1, 4, 7],
    [2, 5, 8],
    [2, 4, 6],
    [3, 4, 5],
    [6, 7, 8],
];

const compTurn = () => {
    if (compArr.length === 0 || gameOver) {
        return;
    }

    let bestMove = null;

    // Check for winning move for the computer
    if ((bestMove = findWinningMove("X")) !== null) {
        // Computer's winning move
    } else if ((bestMove = findWinningMove("O")) !== null) {
        // Block player's winning move
    } else if ((bestMove = createFork("X")) !== null) {
        // Create a fork for the computer
    } else if ((bestMove = blockFork("O")) !== null) {
        // Block opponent's fork
    } else if ((bestMove = takeCenter()) !== null) {
        // Take the center if it's empty
    } else if ((bestMove = takeCorner()) !== null) {
        // Take a corner if available (priority over sides)
    } else if ((bestMove = takeSide()) !== null) {
        // Take a side if no other move is available
    }

    // Execute the computer's move
    if (bestMove !== null) {
        const chosenBox = boxes[bestMove];
        chosenBox.classList.add("red");
        setTimeout(() => {
            chosenBox.innerText = "X";
            chosenBox.disabled = true;
            compArr = compArr.filter((val) => val !== chosenBox);
            count++;
            checkWinner();
        }, 150);
        return; // Exit after making a move
    }
};

boxes.forEach((box) => {
    box.addEventListener("click", () => {
        if (gameOver) {
            return;
        }
        box.classList.add("blue");
        box.innerText = "O";
        box.disabled = true;
        count++;
        compArr = compArr.filter((val) => val !== box);
        if (checkWinner()) {
            return;
        } else if (count < 9) {
            compTurn();
        }
    });
});

//supporting functions for computer's intelligent move

//To find winning move for the computer or the player
const findWinningMove = (symbol) => {
    for (let pattern of winPatters) {
        const [a, b, c] = pattern;
        const values = [
            boxes[a].innerText,
            boxes[b].innerText,
            boxes[c].innerText,
        ];
        if (
            values.filter((val) => val === symbol).length === 2 &&
            values.includes("")
        ) {
            return pattern[values.indexOf("")];
        }
    }
    return null;
};

//to make a double winning move(fork)
const createFork = (symbol) => {
    for (let i = 0; i < boxes.length; i++) {
        if (boxes[i].innerText === "") {
            boxes[i].innerText = symbol; //simulating the move
            let forkCount = 0;
            for (let pattern of winPatters) {
                const [a, b, c] = pattern;
                const values = [
                    boxes[a].innerText,
                    boxes[b].innerText,
                    boxes[c].innerText,
                ];
                if (
                    values.filter((val) => val === symbol).length === 2 &&
                    values.includes("")
                ) {
                    forkCount++;
                }
            }
            boxes[i].innerText = ""; //undo the simulation
            if (forkCount >= 2) {
                return i;
            }
        }
    }
    return null;
};

//blocking opponents fork
const blockFork = (symbol) => {
    return createFork(symbol); //uses the same create fork function to block the opponent fork
};

//taking the center box if empty
const takeCenter = () => {
    return boxes[4].innerText === "" ? 4 : null;
};

//taking a corner
const takeCorner = () => {
    const corners = [0, 2, 6, 8];
    return corners.find((index) => boxes[index].innerText === "") || null;
};

//taking a side if no condition satisfies
const takeSide = () => {
    const sides = [1, 3, 5, 7];
    return sides.find((index) => boxes[index].innerText === "") || null;
};

//functionalities for new-game, winner and reset-btn
const resetGame = () => {
    compArr = Array.from(boxes);
    enableBoxes();
    msgContainer.classList.add("hide");
    gameOver = false;
    count = 0;
    resetBtn.style.display = "inline-block";
};

const enableBoxes = () => {
    for (let box of boxes) {
        box.disabled = false;
        box.innerText = "";
        box.classList.remove("blue", "red");
    }
};

const disableBoxes = () => {
    for (let box of boxes) {
        box.disabled = true;
    }
};

const showMessage = (message) => {
    msg.innerText = message;
    msgContainer.classList.remove("hide");
};

const showWinner = (winner) => {
    disableBoxes();
    gameOver = true;
    showMessage(winner === "X" ? "Computer Wins" : "You Win!");
    resetBtn.style.display = "none";
};

const draw = () => {
    showMessage("Match Draw");
    msgContainer.classList.remove("hide");
    disableBoxes();
    gameOver = true;
    resetBtn.style.display = "none";
};

const checkWinner = () => {
    for (let pattern of winPatters) {
        let pos1Val = boxes[pattern[0]].innerText;
        let pos2Val = boxes[pattern[1]].innerText;
        let pos3Val = boxes[pattern[2]].innerText;

        if (pos1Val != "" && pos2Val != "" && pos3Val != "") {
            if (pos1Val === pos2Val && pos2Val === pos3Val) {
                showWinner(pos1Val);
                return true;
            }
        }
    }
    if (count === 9) {
        draw();
        return true;
    }
    return false;
};

newGameBtn.addEventListener("click", resetGame);
resetBtn.addEventListener("click", resetGame);
