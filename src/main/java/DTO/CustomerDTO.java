package DTO;

import java.sql.Date;

public class CustomerDTO {
    private int customer_id;
    private String customer_name;
    private int tel;
    private Date birthday;
    private String email;
    private Date create_at;

    public CustomerDTO() {

    }
    
    public CustomerDTO(int customer_id, String customer_name, int tel, Date birthday, String email, Date create_at) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.tel = tel;
		this.birthday = birthday;
		this.email = email;
		this.create_at = create_at;
	}

	public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

	@Override
	public String toString() {
		return "CustomerDTO [customer_id=" + customer_id + ", customer_name=" + customer_name + ", tel=" + tel
				+ ", birthday=" + birthday + ", email=" + email + ", create_at=" + create_at + "]";
	}
    
}
