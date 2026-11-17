import java.util.*;
public class Repository<T>
{
    List<T> list=new ArrayList<>();
    public void add(T dto)
    {
        list.add(dto);

        System.out.println("Value is success fully added");
    }
    public void update(T dto)
{
    list.remove(dto);
    list.add(dto);
}
public void delete(String id)
{
}
public List<T> getAll()
{
 return list;
}
}