public class BrowserHistory {
    public static void main(String[] args){

        History his1 = new History();
        his1.setUrl("Instagram.com");
        
        History his2 = new History("Youtube.com");
        History his4 = new History("twitch.com");
        History his3 = new History("Facebook.com", his4);
        

        //System.out.println("URL: "+his1.getUrl());
        //create link
        his1.next = his2;
        his2.next = his3;

        //his1
        System.out.println("url: "+ his1.getUrl());
        //his2
        System.out.println("url: "+ his1.next.getUrl());
        //his3
        System.out.println("url: " +his1.next.next.getUrl());
        //his4
        System.out.println("url: " +his1.next.next.next.getUrl());

        his1.next.next.next.setUrl("Vimeo.com");
        System.out.println("URL "+his1.next.next.next.getUrl());

        History current = his1;
        while(current != null) {
            System.out.println("Current URL "+current.getUrl());
            current = current.next;
        }      
    }
}
