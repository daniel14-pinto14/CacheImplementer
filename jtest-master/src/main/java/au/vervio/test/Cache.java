package au.vervio.test;

/** 
 * The cache interface
 */
public interface Cache<K,V> {
	/**
	 * @return a cached value from the cache, null if none available
	 */
	public V get(K key);

	/**
	 * Put an entry into the cache
	 *
	 * @param key the key that identifies the entry
	 * @param value the value to store
	 * @return the previous entry if one existed before, null otherwise
	 */
	public V put(K key, V value);

	/**
	 * @return true if the key exists, false otherwise
	 */
	public boolean exists(K key);

	/**
	 * Remove an entry out of the cache
	 * @param key
	 */
	public void delete(K key);

}
