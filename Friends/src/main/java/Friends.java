import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Friends extends Foto implements AddFriends,DeleteFriends {
    private HashMap<Long,String> hashMap ;
    Long countId = 0l;


    public Friends() {
        this.hashMap = new HashMap<>();
    }

    @Override
    public boolean addFriends(Long id) {
        if (this.hashMap.containsKey(id))
        {
            return false;
        }
        else
        {
            this.hashMap.put(id,"");
            this.countId = id;
            return true;
        }

    }

    @Override
    public boolean addFriends(String name) {
        this.hashMap.put(this.countId++,name);
        return true;
    }

    @Override
    public boolean deleteFriends(Long id) {
        if (this.hashMap.containsKey(id))
        {
            this.hashMap.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFriends(String name) {
        if (this.hashMap.containsValue(name))
        {
            Set<Map.Entry<Long,String>> entrySet = this.hashMap.entrySet();
            for (Map.Entry<Long, String> setMap:
                 entrySet) {
                if (name.equals(setMap.getValue()))
                {
                    this.hashMap.remove(setMap.getKey());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void addToFriendsFoto(String foto) {
        super.addToFriendsFoto(foto);
        System.out.println("Добавили на аватар друга");
    }

    @Override
    public void deleteToFriendsFoto(String foto) {
        super.deleteToFriendsFoto(foto);
        System.out.println("Удалили на аватар друга");
    }
    public HashMap<Long,String> getFrinds()
    {
        return this.hashMap;
    }
}
