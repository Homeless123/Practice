package day08_switch;

public class BrowserName {
    /*
    write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

		Note: MUST use switch statement
     */
    public static void main(String[] args) {

        String browserName = "Google";

        String browser = "";

        switch (browserName) {
            case "Chrome":
                browser = "chrome";
                break;
                case "Firefox":
                    browser = "firefox";
                    break;
                    case "Opera":
                        browser = "opera";
                        break;
                        case "Safari":
                            browser = "safari";
                            break;
                            case "Edge":
                                browser = "edge";
                                break;
            default:
                browser = browserName+" Invalid Browser";
        }
        System.out.println(browser);
    }
}
