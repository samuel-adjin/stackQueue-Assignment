package problemthree;

public class ProblemThree {

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.html");// Start with home.html
        browser.visit("page1.html"); // Current URL Page
        browser.visit("page2.html"); // Current URL Page
        browser.back(); // Back to: page2.html
        browser.back(); // Back to: home.html
        browser.back(); // Forward to: page1.html
        browser.forward(); // Forward to: page2.html
        browser.forward(); // Forward to: page2.html
        browser.forward();//No forward history.
        browser.visit("page3.html"); // Current URL page
    }
}
