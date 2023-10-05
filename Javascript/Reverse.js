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
        return word.split('').reverse().join('');
    });

    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}
