package problemthree;

import java.util.Stack;

public class BrowserHistory {
    private String currentUrl;
    private Stack<String> back;
    private Stack<String> forward;

    public BrowserHistory(String currentUrl) {
        this.currentUrl = currentUrl;
        back = new Stack<>();
        forward = new Stack<>();
    }

    public void visit(String url) {
        if (url == null) {
            return;
        }
        back.push(currentUrl);
        currentUrl = url;
        forward.clear();
        System.out.println("Visited: " + currentUrl);
    }



    public void forward() {
        if (forward.isEmpty()) {
            System.out.println("No forward history.");
            return;
        }
        back.push(currentUrl);
        currentUrl = forward.pop();
        System.out.println("Forward to: " + currentUrl);

    }

    public void back() {
        if (back.isEmpty()) {
            System.out.println("No history to go back to.");
            return;
        }
        forward.push(currentUrl);
        currentUrl = back.pop();
        System.out.println("Back to: "+currentUrl);
    }

}
