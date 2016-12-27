public class DemoSubscription {

    public static void main(String[] args)
    {
        NewspaperSubscription man1 = new PhysicalNewspaperSubscription("Local","10",10);
        NewspaperSubscription man2 = new PhysicalNewspaperSubscription("International","Ball",10);
        NewspaperSubscription man3 = new OnlineNewspaperSubscription("National","Lost",30);
        NewspaperSubscription man4 = new OnlineNewspaperSubscription("Region","Angel",30);
        System.out.println(man1.getRate());
        System.out.println(man2.getRate());
        System.out.println(man3.getRate());
        System.out.println(man4.getRate());
    }
}