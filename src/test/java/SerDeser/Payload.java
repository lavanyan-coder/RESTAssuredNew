package SerDeser;

public class Payload {
String summary;
/**
 * @return the summary
 */
public String getSummary() {
	return summary;
}
/**
 * @param summary the summary to set
 */
public void setSummary(String summary) {
	this.summary = summary;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the issuId
 */
public IssueType getIssuId() {
	return issuId;
}
/**
 * @param issuId the issuId to set
 */
public void setIssuId(IssueType issuId) {
	this.issuId = issuId;
}
/**
 * @return the id
 */
public Project getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Project id) {
	this.id = id;
}
String description;
public Payload(String summary, String description, IssueType issuId, Project id) {
	super();
	this.summary = summary;
	this.description = description;
	this.issuId = issuId;
	this.id = id;
}
IssueType issuId;
Project id;

}
