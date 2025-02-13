# SecretSantaGame

#Installation

Clone the Project using https://github.com/sadeeshm002/Secret-santa-Java-Project.git. and open in any Java based IDE

After that navigate to src -> com.acme.secretsanta.game package -> SecretSantaGame.java

run SecretSantaGame.java as java application -> it will give SecresantaAssignments.csv file as output   

#solution overview

EmployeeInformation and PreviousYearSecretSantaAssignments data csv files are given as input.

Using BufferedReader in java Library it will read all data in csv file and store it in List

Using PreviousYearSecretSantaAssignments data it will it will create maping for employee and previous year child

Then it will shuffle the given Employee List and assign the child.

once it got the list of employees with secret child it ask user to select file path which is done by using JFrame,JFileChooser java libraries

then it will write the list into csv file using BufferedWriter

After successfull user can get the csv file inthe specified path

#Java 17

#Source

inputfolder - contains csv file inputs

src         - contains java source files
