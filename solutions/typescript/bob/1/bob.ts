export function hey(message: string): string {
  const msg = message.trim()

  const isQuestion = msg.endsWith('?')
  const hasLetters = msg.toLowerCase() !== msg.toUpperCase()
  const isShouting = hasLetters && msg === msg.toUpperCase()

  if (isQuestion && isShouting) {
    return "Calm down, I know what I'm doing!"
  } else if (isShouting) {
    return "Whoa, chill out!"
  } else if (isQuestion) {
    return "Sure."
  } else if (msg === "") {
    return "Fine. Be that way!"
  } else {
    return "Whatever."
  }
}
