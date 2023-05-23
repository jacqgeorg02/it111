import java.io.File;

import static java.lang.System.out;
//For some reason, this didn't show up with help from IntelliJ

public class MyFiles2 {

    public static void main (String[] args) {
//         we have used sout for printing but we're going to change that for this work) ;

//        out.println();  this is interestinng because with the import above, it changed the sout shortcut

//        creating a brand new object

        File dir = new File("/Users/jacqu/IdeaProjects/week7/NewFolder");

//         start with if else statement

        if(dir.exists()){
//             we are going to be happy
//            this is where we're going to call out our array

//            I'm taking the list of directories and assigning it to the string array

            String[] files = dir.list();
//            a new key word -- assert -- I know that these files exist
            assert files != null;
//            this means that the files are not empty

            out.println(files.length + " files found!");
//            this is the number of files in the folder
//            we would like to see those files!! Doesn't that make sense?  We'll do that with a for loop

            for(int i = 0; i < files.length;i++) {

                out.println(files[i]);
            }



            
        } else {

//          we are going to be sad
            out.println("Directory does not exist!!!");
        }



    }
}
