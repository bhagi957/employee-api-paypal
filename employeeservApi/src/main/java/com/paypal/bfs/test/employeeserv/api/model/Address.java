
package com.paypal.bfs.test.employeeserv.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "line_1",
    "line_2",
    "city",
    "state",
    "country",
    "Zipcode"
})
@Entity
@Table(name = "address")
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
	private int id;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("line_1")
    @Column(name = "line1")
    @NotBlank(message = "line1 is mandatory")
    private String line1;
    
    
    @JsonProperty("line_2")
    @Column(name = "line2")
    private String line2;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    @Column(name = "city")
    @NotBlank(message = "city is mandatory")
    private String city;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    @Column(name = "state")
    @NotBlank(message = "state is mandatory")
    private String state;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    @Column(name = "country")
    @NotBlank(message = "country is mandatory")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Zipcode")
    @Column(name = "zipcode")
    @NotBlank(message = "zipcode is mandatory")
    private String zipcode;
   
    @OneToOne(mappedBy = "address")
    private Employee employee;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("line_1")
    public String getLine1() {
        return line1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("line_1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @JsonProperty("line_2")
    public String getLine2() {
        return line2;
    }

    @JsonProperty("line_2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Zipcode")
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("line1");
        sb.append('=');
        sb.append(((this.line1 == null)?"<null>":this.line1));
        sb.append(',');
        sb.append("line2");
        sb.append('=');
        sb.append(((this.line2 == null)?"<null>":this.line2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipcode");
        sb.append('=');
        sb.append(((this.zipcode == null)?"<null>":this.zipcode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
