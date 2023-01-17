import java.util.ArrayList;
import java.util.Scanner;

public class UAS1E {
    private String USERID;

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getFULLNAME() {
        return WhatYouPosts;
    }

    public void setFULLNAME(String FULLNAME) {
        this.WhatYouPosts = FULLNAME;
    }

    private String USERNAME;
    private String WhatYouPosts;

    public UAS1E(String userid, String username, String fullname, ArrayList<String> WhatYouPosts){
        this.USERID  = userid;
        this.USERNAME = username;
        this. WhatYouPosts = fullname;
    }
    private void setMY_MESSAGES(ArrayList<Messages> xMsg){

    }

    public UAS1E(){}
    public static void main(String[] args) {
        UAS1E social = new UAS1E();
        social.setUSERID("001");
        social.setUSERNAME("@whitethat");
        System.out.println("USERID :" + social.getUSERID());
        System.out.println("USERNAME :" + social.getUSERNAME());
        System.out.println("WHATYOUPOSTS :" + social.getFULLNAME());

        int jum_msg=3;
        Scanner UAS = new Scanner(System.in);
        ArrayList<Messages> xMsg = new ArrayList<>();
        for (int index=0; index<jum_msg;index++) {
            Messages msg = new Messages();
            msg.setUserID(social.getUSERID());
            msg.setUserName(social.getUSERNAME());
            System.out.println("Post Message" + String.valueOf(index + 1) + " =");
            String _msg = UAS.nextLine(); 
            msg.WhatYouPosts(_msg);
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);
    }

 }

 class Messages {
    private String UserID;
    private String UserName;
    private ArrayList<Messages> FULLNAME;
    private String WhatYouPosts;

     public Messages(String userID, String userName, ArrayList<Messages> FULLNAME, String whatYouPosts) {
         UserID = userID;
         UserName = userName;
         this.FULLNAME = FULLNAME;
         WhatYouPosts = whatYouPosts;
     }

     public Messages(){

     }

     public String getUserID() {
         return UserID;
     }

     public void setUserID(String userID) {
         UserID = userID;
     }

     public String getUserName() {
         return UserName;
     }

     public void setUserName(String userName) {
         UserName = userName;
     }

     public ArrayList<Messages> getFULLNAME() {
         return FULLNAME;
     }

     public void setFULLNAME(ArrayList<Messages> FULLNAME) {
         this.FULLNAME = FULLNAME;
     }

     public String getWhatYouPosts() {
         return WhatYouPosts;
     }

     public void setWhatYouPosts(String whatYouPosts) {
         WhatYouPosts = whatYouPosts;
     }

     public void WhatYouPosts(String msg) {
     }
 }




