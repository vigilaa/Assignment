const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a sentence: ', (sentence) => {
    let reversedSentence = reverseWords(sentence);
    console.log('Reversed sentence: ' + reversedSentence);
    rl.close();
});

function reverseWords(sentence) {
    let words = sentence.split(" ");

    let reversedWords = words.map(word => {
        let reversedWord = "";
        for (let i = word.length - 1; i >= 0; i--) {
            reversedWord += word[i];
        }
        return reversedWord;
    });

    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}
