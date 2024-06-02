import java.util.*;

class File {
    String fileName;
    String fileContent;

    File(String fileName, String fileContent) {
        this.fileName = fileName;
        this.fileContent = fileContent;
    }

    @Override
    public String toString() {
        return "File Name: " + fileName + "\nFile Content: " + fileContent;
    }
}

class Directory {
    String dirName;
    List<File> files;

    Directory(String dirName) {
        this.dirName = dirName;
        this.files = new ArrayList<>();
    }

    void addFile(String fileName, String fileContent) {
        files.add(new File(fileName, fileContent));
    }

    @Override
    public String toString() {
        return "Directory Name: " + dirName;
    }

    public void displayFiles() {
        for (File file : files) {
            System.out.println(file);
        }
    }

    public File findFile(String fileName) {
        for (File file : files) {
            if (file.fileName.equals(fileName)) {
                return file;
            }
        }
        return null;
    }
}

public class DirectoryManagemen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Directory> directories = new ArrayList<>();

        while (true) {
            System.out.println("1. Enter Program \n2. Close Program");
            int entry = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (entry == 1) {
                System.out.println("1. Create a directory \n2. Create a file \n3. Display all files \n4. Display all directories \n5. Display file content");
                int choice = sc.nextInt();
                sc.nextLine();  // Consume newline

                if (choice == 1) {
                    System.out.println("Enter directory name: ");
                    String dirName = sc.nextLine();
                    directories.add(new Directory(dirName));
                    System.out.println("Directory created.");
                } else if (choice == 2) {
                    System.out.println("Enter directory name where file should be created: ");
                    String dirName = sc.nextLine();
                    Directory dir = findDirectory(directories, dirName);
                    if (dir != null) {
                        System.out.println("Enter file name: ");
                        String fileName = sc.nextLine();
                        System.out.println("Enter file content: ");
                        String fileContent = sc.nextLine();
                        dir.addFile(fileName, fileContent);
                        System.out.println("File created.");
                    } else {
                        System.out.println("Directory not found.");
                    }
                } else if (choice == 3) {
                    System.out.println("Enter directory name to display all files: ");
                    String dirName = sc.nextLine();
                    Directory dir = findDirectory(directories, dirName);
                    if (dir != null) {
                        dir.displayFiles();
                    } else {
                        System.out.println("Directory not found.");
                    }
                } else if (choice == 4) {
                    for (Directory dir : directories) {
                        System.out.println(dir);
                    }
                } else if (choice == 5) {
                    System.out.println("Enter directory name where the file is located: ");
                    String dirName = sc.nextLine();
                    Directory dir = findDirectory(directories, dirName);
                    if (dir != null) {
                        System.out.println("Enter file name to display its content: ");
                        String fileName = sc.nextLine();
                        File file = dir.findFile(fileName);
                        if (file != null) {
                            System.out.println(file);
                        } else {
                            System.out.println("File not found.");
                        }
                    } else {
                        System.out.println("Directory not found.");
                    }
                } else {
                    System.out.println("Choose correct input...");
                }
            } else if (entry == 2) {
                System.out.println("Exit.....");
                break;
            } else {
                System.out.println("Choose correct input....");
            }
        }

        sc.close();
    }

    public static Directory findDirectory(List<Directory> directories, String dirName) {
        for (Directory directory : directories) {
            if (directory.dirName.equals(dirName)) {
                return directory;
            }
        }
        return null;
    }
}
