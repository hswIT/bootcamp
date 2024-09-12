import java.util.ArrayList;
import java.util.List;

public class SuperMap<K, V> {
  private List<SuperEntry<K, V>> entries;
  
  public SuperMap(){
    this.entries = new ArrayList<>();
  }

  public SuperEntry<K, V> getEntry(K key){
    if (key == null) 
      return null;
    for (SuperEntry<K, V> entry : this.entries){
      if (entry.getKey().equals(key)){
        return entry;
      }
    }
    return null;
  }

  public void put(K key, V value){
    // if not duplicates
    SuperEntry<K, V> entry = this.getEntry(key);
    if (entry == null){
      this.entries.add(new SuperEntry<>(key, value));
      return;
    }
    // if duplicates
    entry.setValue(value);
  }

  public V get(K key){
    SuperEntry<K, V> entry = this.getEntry(key);
    return entry == null ? null : entry.getValue();
  }

  public int size(){
    return this.entries.size();
  }



  public static void main(String[] args) {

    SuperMap<String, String> nameMap = new SuperMap<>();
    nameMap.put("john", "apple");
    nameMap.put("vincent", "orange");
    System.out.println(nameMap);
    System.out.println(nameMap.getEntry("vincent").getValue());
    System.out.println(nameMap.get("john"));
    nameMap.put("john", "banana");
    System.out.println(nameMap.get("john"));
    System.out.println(nameMap.size());
  }

}
