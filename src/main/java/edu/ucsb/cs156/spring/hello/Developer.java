package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Roy";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "jiahuaren";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-02");
        team.addMember("Ayala");
        team.addMember("Mujia");
        team.addMember("Roy");
        team.addMember("Evania");
        team.addMember("Shiyuan");
        team.addMember("Xinyan");
        return team;
    }
}
