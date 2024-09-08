package revision;

public interface Debitable<T>{
  boolean debit(T value);
}
