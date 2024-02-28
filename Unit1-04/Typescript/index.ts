/**
 * This program is the dice game
 *
 * By: Evan Beaudoin
 * Version: 1.0
 * Since:   2024-02-27
 */


import { createPrompt } from 'bun-promptx'

const min = 1;
const max = 6;
const randomNumber = Math.floor(Math.random() * (max - min + 1) + min);

var guessString = createPrompt('Pick a number between 1 and 6: ')
var guess = parseInt(guessString.value || "-1")


if (isNaN(guess) == true || guess < min || guess > max) {
  console.log("Invalid Input")
}
else {
  
  let tries = 1
  
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
  console.log("\nYou got it in " + tries + " tries!")
}
console.log('\nDone.')

