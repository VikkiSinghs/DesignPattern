package Builder;

public class Build {
    private String head;
    private String chest;
    private String foot;
    private String hands;

    private Build(Attire dress){
        this.head= dress.head;
        this.chest=dress.chest;
        this.foot=dress.foot;
        this.hands=dress.hands;
    }

    public String getHead(){
        return head;
    }
    public String getChest(){
        return chest;
    }
    public String getFoot(){
        return foot;
    }
    public String getHands(){
        return hands;
    }

    public static class Attire{
        private final String head;
        private final String chest;
        private String hands=" ";
        private String foot=" ";

        Attire(String head,String chest) {
            this.head = head;
            this.chest=chest;
        }
        public Attire hands(String hands){
            this.hands=hands;
            return this;
        }
        public Attire foot(String foot){
            this.foot=foot;
            return this;
        }
        public Build dress(){
            return new Build(this);
        }
    }
}
