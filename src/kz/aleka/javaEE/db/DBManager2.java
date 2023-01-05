package kz.aleka.javaEE.db;

import kz.aleka.javaEE.model.News;

import java.util.ArrayList;

public class DBManager2 {
    private static ArrayList<News> list = new ArrayList<>();
    private static Long id = 6L;
    static {
        list.add(new News(1L,
                "The Crazy Way Falcon And The Winter Soldier's Anthony Mackie Learned About Captain America 4",
                "Last Friday, Disney+'s The Falcon and the Winter Soldier concluded its six-episode run, " +
                        "and among the major events in the finale was Anthony Mackie's Sam Wilson suiting up as Captain America for the first time.",
                "Adam Holmes","cinema"));
        list.add(new News(2L,
                "Gregg Berhalter: Giovanni Reyna's mother reported head coach to US Soccer",
                "The mother of United States midfielder Giovanni Reyna says she reported head coach Gregg Berhalter " +
                        "for kicking his wife when they were teenagers.",
                "Dirk Libbey","sport"));
        list.add(new News(3L,
                "Walter Ulloa, Latino media pioneer, remembered as a 'role model'",
                "The founder of Entravision, who died at age 74, was lauded by Hispanic leaders for being " +
                        "a trailblazer and for his burning desire to improve the community.",
                "Suzanne Gamboa","culture"));
        list.add(new News(4L,
                "James Gunn Responds To Rumors Wonder Woman Is Being Left Out Of The DCEU",
                "The DC Extended Universe is known for its wild twists both behind and in front of the camera, " +
                        "keeping the audience on their toes in the process. This has been especially true over the last few months.",
                "Corey Chichizola","cinema"));
        list.add(new News(5L,
                "Emma Raducanu retires in tears with ankle injury 11 days before Australian Open",
                "Emma Raducanu criticised the slippery courts at the ASB Classic in Auckland after retiring from her " +
                        "second-round match with an ankle injury.",
                "Adreon Patterson","sport"));
    }

    public static void addNews(News news){
        news.setId(id);
        list.add(news);
        id++;
    }

    public static ArrayList<News> getList(){
        return list;
    }


}
