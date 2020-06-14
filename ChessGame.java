package sk.itsovy.vasinsky.projectChess;


import java.util.HashSet;
import java.util.Set;

public class ChessGame {
    public String[][] board = {
            {"1", "2", "3", "4", "5", "6", "7", "8"},
            {"A", "B", "C", "D", "E", "F", "G", "H"}
    };

    public String normalize(String item) {
        if (item == null || item.length() != 2) {
            return null;
        }
        item = item.toUpperCase();
        if (((int) item.charAt(0) >= 49 && (int) item.charAt(0) <= 56) && ((int) item.charAt(1) >= 65 && (int) item.charAt(1) <= 72)) {
            String string = String.valueOf(item.charAt(1));
            string += String.valueOf(item.charAt(0));
            item = string;
        }
        if ((int) item.charAt(0) < 65 || (int) item.charAt(0) > 72) {
            return null;
        }
        if ((int) item.charAt(1) < 49 || (int) item.charAt(1) > 56) {
            return null;
        }
        return item;

    }

    public boolean checkBishop(String pos, String dest) {
        pos = normalize(pos);
        dest = normalize(dest);
        System.out.println(pos);
        if (pos == null || dest == null) {
            return false;
        }
        if (pos.equals(dest)) {
            return false;
        }

        System.out.println((int)dest.charAt(0)-  65);
        System.out.println((int)dest.charAt(1)-49);
        if ((int)dest.charAt(0) -  65 != (int)dest.charAt(1)-49) {
            return false;
        }
        return true;
    }

    public boolean checkQueen(String pos, String dest) {
        pos = normalize(pos);
        dest = normalize(dest);
        if (pos == null || dest == null) {
            return false;
        }
        if (pos.equals(dest)) {
            return false;
        }
        return true;
    }

    public boolean checkKing(String pos, String dest) {
        pos = normalize(pos);
        dest = normalize(dest);
        if (pos == null || dest == null) {
            return false;
        }
        if (pos.equals(dest)) {
            return false;
        }
        if (!((Math.abs(pos.charAt(0) - dest.charAt(0)) <= 1) && (Math.abs(pos.charAt(1) - dest.charAt(1)) <= 1))) {
            return false;
        }
        return true;
    }

    public Set possibleMovementsKnight(String pos, String dest) {
        Set<String> movements = new HashSet<>();
        return movements;
    }

    public boolean checkKnight(String pos, String dest) {
        pos = normalize(pos);
        dest = normalize(dest);
        if (pos == null || dest == null) {
            return false;
        }
        if (pos.equals(dest)) {
            return false;
        }
        return true;
    }

    public boolean checkRook(String pos, String dest) {
        pos = normalize(pos);
        dest = normalize(dest);
        if (pos == null || dest == null) {
            return false;
        }
        if (pos.equals(dest)) {
            return false;
        }
        if (!((pos.charAt(0) == dest.charAt(0)) || (pos.charAt(0) == dest.charAt(1)))) {
            return false;
        }
        return true;
    }

    public boolean checkPawn(String pos, String dest) {
        pos = normalize(pos);
        dest = normalize(dest);
        if (pos == null || dest == null) {
            return false;
        }
        if (pos.equals(dest)) {
            return false;
        }
        return true;
    }
}