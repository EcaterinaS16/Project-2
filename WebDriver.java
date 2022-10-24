package project2;

public interface WebDriver {
    /*
    Provide Implementation for the diagram below. Then create a test class in which you need to create
    Objects of ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.
     */
    void open();
    void close();
    String getTitle();

}
interface TakeScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakeScreenshot {
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
   public  void  open(){
        System.out.println("open chrome");
    }
    @Override
   public void close(){
        System.out.println("close chrome");
    }
    @Override
    public String getTitle(){
       String S="Chrome";
        return S;
    }
    @Override
    public void navigate(){
        System.out.println("navigate chrome");
    }
    @Override
    public void  getScreenshot(){
        System.out.println("take a screenshot in Chrome");
        System.out.println("       ");
    }
}

class FirefoxDriver  implements RemoteWebDriver{
    public  void  open(){
        System.out.println("open firefox");
    }
    public void close(){
        System.out.println("close firefox");
    }
    public String getTitle(){
       String S="Firefox";
        return S;
    }
    public void navigate() {
        System.out.println("navigate firefox");
    }
    @Override
    public void  getScreenshot(){
        System.out.println("take a screenshot in FireFox");
        System.out.println("    ");
    }
}

class SafariDriver implements RemoteWebDriver{
    public  void  open(){
        System.out.println("open safari");
    }
    public void close(){
        System.out.println("close safari");
    }

    public String getTitle(){
        String S="Safari";
            return  S;

    }
    public void navigate() {
        System.out.println("navigate safari");
    }
    @Override
    public void  getScreenshot(){
        System.out.println("take a screenshot in Safari");
        System.out.println("        ");
    }
}
class Tester {
    public static void main(String[] args) {
        RemoteWebDriver[] browsers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver br : browsers) {
            br.open();
            br.close();
            System.out.println(br.getTitle());
            br.navigate();
            br.getScreenshot();

        }
    }
}

