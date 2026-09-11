/**
 * The class containing all the dungeon floor maps
*/
public class MapMaster {

    /*
     * MAP KEY:
     * S - starting location of the floor
     * d - a door and stairs leading down
     */


    /**
     * Starting Dungeon floor. Contains only a door.
     */
    private static final char[][] start = {{'*','*','*'},
                                           {'s',' ','d'},
                                           {'*','*','*'}};

    /**
     * Floor 1 of the dungeon
     */
    private static final char[][] floor1 = {{'*','s','*','*','*','*'},
                                            {'*',' ',' ',' ',' ','*'},
                                            {'*',' ',' ',' ',' ','*'},
                                            {'*',' ',' ',' ',' ','*'},
                                            {'*','*','*','*','*','*'}};

    public static char[][] getMap(int floor) {
        switch (floor) {
            case 1: 
                return floor1;
            
            default: 
                return start;
        }
    }

    // public static int[] getStartLocation(int floor) {
    //     switch (floor) {
    //         case 1:
    //             int[] location = {0,1};
    //             return location;

    //         defualt:
    //             int[] location = {0,1};
    //             return location;
    //     }
    // }
}