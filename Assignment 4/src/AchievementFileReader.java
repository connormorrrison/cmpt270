//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.List;
//import java.util.Scanner;
//
//public class AchievementFileReader {
//
//    /**
//     * The current file path where achievement are read from/written to
//     */
//    private String filePath;
//
//    /**
//     * A File object at the location indicated by filePath
//     */
//    private File myObj;
//
//    /**
//     * Constructor, initialize reader with empty file path
//     */
//    public AchievementFileReader() {
//        this.filePath = "";
//    }
//
//    /**
//     * reads achievements from a text file at the specified filepath
//     * @param filepath filepath to text file where achievements are saved
//     * @return a newly created AchievementManager object initialized with all
//     * the achievements stored in the file
//     * @throws FileNotFoundException if the file location does not exist
//     */
//    public AchievementManager readAchievements(String filepath) throws FileNotFoundException
//    {
//        filePath = filepath;
//        AchievementManager manager = new AchievementManager();
//        Scanner sc = null;
//        try
//        {
//            myObj = new File(this.filePath);
//            sc = new Scanner(myObj);
//            while(sc.hasNextLine())
//            {
//                String data = sc.nextLine();
//                String[] words = data.split(",");
//                if(words.length != 2)
//                {
//                    System.out.println("Error reading line, incorrect format: " + data);
//                    continue;
//                }
//                String name = words[0];
//                String description = words[1];
//                Achievement a = new Achievement(name, description);
//                manager.addAchievement(a);
//            }
//        }
//        finally{
//            if(sc != null)
//                sc.close();
//        }
//        return manager;
//    }
//
//    /**
//     * Extracts all of the achievements from the provided AchievementManager and
//     * writes them to a text file
//     * @param manager an AchievementManager containing the achievements to be written
//     *                to a text file
//     * @throws FileNotFoundException if the file does not exist at the saved location
//     */
//    public void writeAchievements(AchievementManager manager) throws FileNotFoundException
//    {
//        try(PrintWriter pw = new PrintWriter(myObj))
//        {
//            List<Integer> keys = manager.getAllKeys();
//            for(int key : keys)
//            {
//                Achievement a = manager.getAchievement(key);
//                String output = a.getAchievementName() + "," + a.getAchievementDescription();
//                pw.println(output);
//            }
//        }
//    }
//
//    /**
//     * Returns the path where achievements are read/written to
//     * @return the currently saved file path
//     */
//    public String getCurrentFilePath()
//    {
//        return this.filePath;
//    }
//}
