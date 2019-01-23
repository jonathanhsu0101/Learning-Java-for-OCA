package corelesson4.prototype;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Cloneable, Serializable {
	private Address address;
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	//深拷貝
	public Object deepClone(){
		try {
			//先做序列化
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			oos.flush();
			oos.close();
			//再做反序列化
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			// 利用bos.toByteArray()得到 bos 存入的ByteArray值
			ObjectInputStream ois = new ObjectInputStream(bis);
			return ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
