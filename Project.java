package io.orten.nano.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long Id;
    @Column(name = "projectID",unique = true)
    private String projectID;
    @Column(name = "name")
    private String name;
    @Column(name = "fromDate")
    private Date fromDate;
    @Column(name = "toDate")
    private Date toDate;
    @Column(name = "longitude")
    private float longitude;
    @Column(name = "latitude")
    private float latitude;
    @Column(name = "amountToBeRaised")
    private double amountToBeRaised;
    @Column(name = "raisedFunding")
    private double raisedFunding;
    @Column(name = "description")
    private String description;
    @Column(name = "imageOrvideo")
    private String imageOrvideo;
    @Column(name = "projectManager")
    private String projectManager;
    @Column(name = "nationalProject")
    private boolean nationalProject;
    @Column(name = "recurringProject")
    private boolean recurringProject;
    @Column(name = "recurringProjectPublishingDate")
    private Date recurringProjectPublishingDate;
    @Column(name = "organizationID")
    private String organizationID;

    public Project(){}

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
    public String getProjectID() {
        return projectID;
    }
    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getFromDate() {
        return fromDate;
    }
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
    public Date getToDate() {
        return toDate;
    }
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    public float getLongitude() {return longitude;}
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    public float getLatitude() {
        return latitude;
    }
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    public double getAmountToBeRaised() {
        return amountToBeRaised;
    }
    public void setAmountToBeRaised(double amountToBeRaised) {
        this.amountToBeRaised = amountToBeRaised;
    }
    public double getRaisedFunding() {
        return raisedFunding;
    }
    public void setRaisedFunding(double raisedFunding) {
        this.raisedFunding = raisedFunding;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageOrvideo() {
        return imageOrvideo;
    }
    public void setImageOrvideo(String imageOrvideo) {
        this.imageOrvideo = imageOrvideo;
    }
    public String getProjectManager() {
        return projectManager;
    }
    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }
    public boolean isNationalProject() {
        return nationalProject;
    }
    public void setNationalProject(boolean nationalProject) {
        this.nationalProject = nationalProject;
    }
    public boolean isRecurringProject() {
        return recurringProject;
    }
    public void setRecurringProject(boolean recurringProject) {
        this.recurringProject = recurringProject;
    }
    public Date getRecurringProjectPublishingDate() {
        return recurringProjectPublishingDate;
    }
    public void setRecurringProjectPublishingDate(Date recurringProjectPublishingDate) {
        this.recurringProjectPublishingDate = recurringProjectPublishingDate;}
    public String getOrganizationID() {
        return organizationID;
    }
    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }
}