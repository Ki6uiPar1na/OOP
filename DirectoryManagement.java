import java.util.ArrayList;
import java.util.Scanner;

class Directory{
    String directoryName; 

    Directory(String directoryName){
        this.directoryName = directoryName;
    }

    @Override
    public String toString(){
        return "Directory Name: " + directoryName;
    }
}

class File{
    String fileName; 
    String fileContent;

    File(String fileName, String fileContent){
        this.fileName = fileName;
        this.fileContent = fileContent;
    }

    @Override
    public String toString(){
        return "File Name: " + fileName + "File Content: " + fileContent;
    }
}


public class DirectoryManagement {

    public static void main(String[] args) {
        ArrayList<Directory> directories = new ArrayList<>();
        ArrayList<File> files = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enter the program \n2. Exit Program");
            int entry = sc.nextInt();
            if(entry == 1){
                System.out.println("1. Create a directory \n2. Create a file \n3. Show the files \n4. Show the directorys \n5. Show the file content");
                int select = sc.nextInt();
                if(select == 1){
                    System.out.println("Enter directory name: ");
                    String directoryName = sc.next();
                    Directory newDirectory = new Directory(directoryName);
                    directories.add(newDirectory);
                }
                else if(select == 2){
                    System.out.println("Enter file name: ");
                    String fileName = sc.next();
                    System.out.println("Enter file content: ");
                    String fileContent = sc.next();
                    File newFile = new File(fileName, fileContent);
                    files.add(newFile);
                }
                else if(select == 3){
                    System.out.println("Existing Files is: ");
                    for (File file : files) {
                        System.out.println(file.fileName);
                    }
                }
                else if(select == 4){
                    System.out.println("Existing Direcotes is: ");
                    for (Directory directory : directories) {
                        System.out.println(directory);
                    }
                }
                else if(select == 5){
                    System.out.println("Enter the file name: ");
                    String fileName = sc.next();
                    File fileContent = printFile(files, fileName);
                    System.out.println("File content is : ");
                    System.out.println("    " + fileContent.fileContent);
                }
                else{
                    System.out.println("Enter correct input");
                }
            }
            else{
                System.out.println("Exit.....");
                break;
            }
        }
    }

    public static Directory printDirectory(ArrayList<Directory> directories, String directoryName){
        for (Directory directory : directories) {
            if(directory.directoryName.equals(directoryName)){
                return directory;
            }
        }
        return null;
    }

    public static File printFile(ArrayList<File> files, String fileName){
        for (File file : files) {
            if(file.fileName.equals(fileName)){
                return file;
            }
        }
        return null;
    }
};