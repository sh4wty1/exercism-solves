// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Calculates the total bird count.
 *
 * @param {number[]} birdsPerDay
 * @returns {number} total bird count
 */
export function totalBirdCount(birdsPerDay) {
  let totalBirds = 0;
  for (const element of birdsPerDay) {
    totalBirds += element;
  }
  return totalBirds
}

/**
 * Calculates the total number of birds seen in a specific week.
 *
 * @param {number[]} birdsPerDay
 * @param {number} week
 * @returns {number} birds counted in the given week
 */
export function birdsInWeek(birdsPerDay, week) {
  const lastIndex = week * 7 - 1
  const firstIndex = lastIndex - 6
  let birdsCounter = 0
  for (let i = firstIndex; i <= lastIndex; i++) {
    birdsCounter += birdsPerDay[i]
  }
  return birdsCounter
}

/**
 * Fixes the counting mistake by increasing the bird count
 * by one for every second day.
 *
 * @param {number[]} birdsPerDay
 * @returns {number[]} corrected bird count data
 */
export function fixBirdCountLog(birdsPerDay) {
  birdsPerDay.forEach((_, index) => {
    if (index % 2 === 0) {
      return birdsPerDay[index] += 1
    } else {
      return birdsPerDay
    }
  })
  return birdsPerDay
}
