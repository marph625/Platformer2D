package utils;

public class Constants {

    public static class Directions{
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class PlayerConstants {
        public static final int RUNNING = 0;
        public static final int IDLE = 1;
        public static final int JUMP = 2;
        public static final int DOUBLE_JUMP = 3;
        public static final int WALL_JUMP = 4;
        public static final int HIT = 5;
        public static final int FALL = 6;
        public static int GetSpriteAmount(int player_action) {
            switch (player_action) {
                case RUNNING:
                    return 12;
                case IDLE:
                    return 11;
                case DOUBLE_JUMP:
                    return 6;
                case WALL_JUMP:
                    return 5;
                case HIT:
                    return 7;
                default:
                    return 1;
            }
        }
    }
}
