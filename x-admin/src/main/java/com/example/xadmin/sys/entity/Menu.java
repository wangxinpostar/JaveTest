package com.example.xadmin.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName x_menu
 */
@TableName(value = "x_menu")
public class Menu implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer menuId;

    /**
     *
     */
    private String component;

    /**
     *
     */
    private String path;

    /**
     *
     */
    private String redirect;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String title;

    /**
     *
     */
    private String icon;

    /**
     *
     */
    private Integer parentId;

    /**
     *
     */
    private String isLeaf;

    /**
     *
     */
    private Integer hidden;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     *
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     *
     */
    public String getComponent() {
        return component;
    }

    /**
     *
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     *
     */
    public String getPath() {
        return path;
    }

    /**
     *
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     */
    public String getRedirect() {
        return redirect;
    }

    /**
     *
     */
    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    /**
     *
     */
    public String getName() {
        return name;
    }

    /**
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     *
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     *
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     *
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    /**
     *
     */
    public Integer getHidden() {
        return hidden;
    }

    /**
     *
     */
    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Menu other = (Menu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
                && (this.getComponent() == null ? other.getComponent() == null : this.getComponent().equals(other.getComponent()))
                && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
                && (this.getRedirect() == null ? other.getRedirect() == null : this.getRedirect().equals(other.getRedirect()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
                && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
                && (this.getIsLeaf() == null ? other.getIsLeaf() == null : this.getIsLeaf().equals(other.getIsLeaf()))
                && (this.getHidden() == null ? other.getHidden() == null : this.getHidden().equals(other.getHidden()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getComponent() == null) ? 0 : getComponent().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getRedirect() == null) ? 0 : getRedirect().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getIsLeaf() == null) ? 0 : getIsLeaf().hashCode());
        result = prime * result + ((getHidden() == null) ? 0 : getHidden().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", component=").append(component);
        sb.append(", path=").append(path);
        sb.append(", redirect=").append(redirect);
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", icon=").append(icon);
        sb.append(", parentId=").append(parentId);
        sb.append(", isLeaf=").append(isLeaf);
        sb.append(", hidden=").append(hidden);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}