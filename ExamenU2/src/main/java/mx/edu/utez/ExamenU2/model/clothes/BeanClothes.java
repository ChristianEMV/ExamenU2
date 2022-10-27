package mx.edu.utez.ExamenU2.model.clothes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

    @XmlRootElement(name = "BeanClothes")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class BeanClothes {
        @XmlElement
        private int clothe_id;
        @XmlElement
        private String name;
        @XmlElement
        private double price;
        @XmlElement
        private String size;
        @XmlElement
        private String brand;
        @XmlElement
        private int stock;
        @XmlElement
        private String cloth_type;
        @XmlElement
        private String created_at;
        @XmlElement
        private boolean status;
        @XmlElement
        private int category_id;
        @XmlElement
        private int clothe_type_id;

        public BeanClothes() {
        }
        public BeanClothes(int clothe_id, String name, double price, String size, String brand, int stock, String cloth_type, String created_at, boolean status, int category_id, int clothe_type_id) {
            this.clothe_id = clothe_id;
            this.name = name;
            this.price = price;
            this.size = size;
            this.brand = brand;
            this.stock = stock;
            this.cloth_type = cloth_type;
            this.created_at = created_at;
            this.status = status;
            this.category_id = category_id;
            this.clothe_type_id = clothe_type_id;
        }

        public int getClothe_id() {
            return clothe_id;
        }

        public void setClothe_id(int clothe_id) {
            this.clothe_id = clothe_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public String getCloth_type() {
            return cloth_type;
        }

        public void setCloth_type(String cloth_type) {
            this.cloth_type = cloth_type;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public int getCategory_id() {
            return category_id;
        }

        public void setCategory_id(int category_id) {
            this.category_id = category_id;
        }

        public int getClothe_type_id() {
            return clothe_type_id;
        }

        public void setClothe_type_id(int clothe_type_id) {
            this.clothe_type_id = clothe_type_id;
        }
    }

