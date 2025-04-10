package DesignPatterns.StructuralPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, Tree> treeMap = new HashMap<>();
    public static Tree getTree(String treeName) {
        if(!treeMap.containsKey(treeName)){
            switch(treeName){
                case "Pine Tree":
                    treeMap.put("Pine Tree" ,new  PineTree());
                    break;
                case "Oak Tree":
                    treeMap.put("Oak Tree" ,new  OakTree());
                    break;
                case "Mango Tree":
                    treeMap.put("Mango Tree" ,new  MangoTree());
                    break;
            }
        }
        return  treeMap.get(treeName);
    }
}
