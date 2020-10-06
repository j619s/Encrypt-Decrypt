# Encrypt-Decrypt

## You can encrypt or decrypt your message using two different algorithms. 

<ul>
<li> <h4> 1. Unicode: Where you can encrypt-decrypt all the unicode characters. </h4> </li>
<li> <h4> 2. Shift: Where you can encrypt or decrypt only alphabets. </h4></li>
</ul>
<h4> Template Method design pattern is used in this project so that you can add multiple other encryption-decryption algorithms. </h4>
<h4>You can also provide file paths for input and output to take input from a file and save output in a file respectively.</h4>
<h4>You have to pass all the input via arguments.</h4>

#### All the code is in the "task" folder of Encryption-Decryption.

## Example 1

`java Main -mode enc -in input.txt -out output.txt -key 5 -alg unicode`
#### This command must get data from the file input.txt, encrypt the data with the key 5, create a file called output.txt and write ciphertext to it.

## Example 2

### Input:

`java Main -mode enc -key 5 -data "hello github!@#" -alg unicode`
### Output:

mjqqt%lnymzg&E(

## Example 3

### Input:

`java Main -key 5 -alg unicode -data "mjqqt%lnymzg&E(" -mode dec`
### Output:

hello github!@#

## Example 4:

### Input:

`java Main -key 5 -alg shift -data "hello github!!" -mode enc`
### Output:

mjqqt lnymzg!!

## Example 5:

### Input:

`java Main -key 5 -alg shift -data "mjqqt lnymzg!!" -mode dec`

### Output:

hello github!!
