/*
*This program calculates the number of logs a truck
* can carry based on length and mass accordingly
*
* By:Evan Beaudoin
* Version: 1.0
* Since:   2024-02-16
*/


import { createPrompt } from 'bun-promptx'

const loggingTruckLimit = 1100

const lengthOfLog = createPrompt('Enter the length of the logs in meters --> 0.25, 0.5, 1: ? ')

console.log(`\nEnter the length of the logs that you would like to move with a truck: ${String(lengthOfLog.value)}`)


try {
  if (isNaN(Number(lengthOfLog.value))) {
    throw new Error('Invalid input. Please enter a valid number for the length of logs.')
  }
  let massOfLogs = 20 * Number(lengthOfLog.value)

  if (massOfLogs === 0) {
    throw new Error('Calculation error. Mass of logs cannot be zero.')
  }

  let numberOfLogs = loggingTruckLimit / massOfLogs

  console.log(`The number of logs that can be moved with a truck is ${String(numberOfLogs)}`)
} catch (error) {
  console.error(`Error: ${error.message}`)
}

console.log('\nDone.')

