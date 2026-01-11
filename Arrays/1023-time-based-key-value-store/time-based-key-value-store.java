class TimeMap {
    Map<String,TreeMap<Integer,String>> timemap ;

    public TimeMap() {
        timemap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        timemap.computeIfAbsent(key,k -> new TreeMap<>()).put(timestamp,value);
        
    }
    
    public String get(String key, int timestamp) {
        if(!timemap.containsKey(key)) return "";

        TreeMap<Integer,String> timestampmap = timemap.get(key);
        Map.Entry<Integer, String> entry = timestampmap.floorEntry(timestamp);

        return   entry ==null?"":entry.getValue();



        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */