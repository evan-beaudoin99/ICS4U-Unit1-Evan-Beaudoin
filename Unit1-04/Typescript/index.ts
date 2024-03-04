/**
<<<<<<< HEAD
=======

>>>>>>> 0aae044365984b4b5a3c59ecace3bf51fe97b5c0
 * This program is the dice game
 *
 * By: Evan Beaudoin
 * Version: 1.0
 * Since:   2024-02-27
 */


import { createPrompt } from 'bun-promptx'

<<<<<<< HEAD
const min = 1;
const max = 6;
const randomNumber = Math.floor(Math.random() * (max - min + 1) + min);
=======
const min = 1
const max = 6
const randomNumber = Math.floor(Math.random() * (max - min + 1) + min)
>>>>>>> 0aae044365984b4b5a3c59ecace3bf51fe97b5c0

var guessString = createPrompt('Pick a number between 1 and 6: ')
var guess = parseInt(guessString.value || "-1")


<<<<<<< HEAD
if (isNaN(guess) == true || guess < min || guess > max) {
=======
if (isNaN(guess) == true  && guess > 1 && guess < 6) {
>>>>>>> 0aae044365984b4b5a3c59ecace3bf51fe97b5c0
  console.log("Invalid Input")
}
else {
  
<<<<<<< HEAD
  let tries = 1
=======
  let tries = 0
>>>>>>> 0aae044365984b4b5a3c59ecace3bf51fe97b5c0
  
  while (guess != randomNumber) {
    
    if (guess < randomNumber) {
      console.log("You are too low!")
    }
      
    else if (guess > randomNumber) {
      console.log("You are too high!")
    }

    var guessString = createPrompt('\nGuess again: ')
    var guess = parseInt(guessString.value || "-1")
    
    tries++
  }
  console.log("\nYou are correct!")
<<<<<<< HEAD
  console.log("\nYou got it in " + tries + " tries!")
}
console.log('\nDone.')
=======
  console.log("\nThe number was " + randomNumber)
  console.log("\nYou got it in " + tries + " tries!")
}
console.log('Done.')
>>>>>>> 0aae044365984b4b5a3c59ecace3bf51fe97b5c0

