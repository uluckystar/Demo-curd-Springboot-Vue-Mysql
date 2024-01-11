package com.localaihub.curdspringbootvuejsmysql.model;

import jakarta.persistence.*;

/**
 * @author Jiaxing Jiang
 * @version 0.1.0-SNAPSHOT
 * @date 2024/1/10 00:06
 */

@Entity
@Table(name = "tutorials")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial() {

    }

    /*
    * 在JPA中，实体类通常需要一个无参的构造函数。这是因为JPA需要通过反射来创建实体类的实例，而无参的构造函数是反射创建对象的基本方式。如果你的实体类没有无参的构造函数，JPA将无法正确地创建实体类的实例，这将导致运行时错误。
    * 在代码中，Toturial类已经包含了一个无参的构造函数，所以JPA应该能够正确地创建Toturial类的实例。如果你删除了这个无参的构造函数，JPA将无法创建Toturial类的实例，这将导致运行时错误。
    * */
    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                '}';
    }
}
