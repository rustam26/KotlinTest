package ru.kosimov.KotlinTest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class TestUnity {
    @Id
    private Long id;
    private Long documentId;
    private Long documentDate;
    private Long dictionaryValueId;
    private String dictionaryValueName;
    private String sortOrder;

    private Long testId;
    private String testName;

    public TestUnity() {

    }

    public TestUnity(Long id, Long documentId, Long documentDate,
                     Long dictionaryValueId, String dictionaryValueName,
                     String sortOrder, Long testId, String testName) {
        this.id = id;
        this.documentId = documentId;
        this.documentDate = documentDate;
        this.dictionaryValueId = dictionaryValueId;
        this.dictionaryValueName = dictionaryValueName;
        this.sortOrder = sortOrder;
        this.testId = testId;
        this.testName = testName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestUnity testUnity = (TestUnity) o;
        return Objects.equals(id, testUnity.id) && Objects.equals(documentId, testUnity.documentId) && Objects.equals(documentDate, testUnity.documentDate) && Objects.equals(dictionaryValueId, testUnity.dictionaryValueId) && Objects.equals(dictionaryValueName, testUnity.dictionaryValueName) && Objects.equals(sortOrder, testUnity.sortOrder) && Objects.equals(testId, testUnity.testId) && Objects.equals(testName, testUnity.testName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, documentId, documentDate, dictionaryValueId, dictionaryValueName, sortOrder, testId, testName);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Long getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Long documentDate) {
        this.documentDate = documentDate;
    }

    public Long getDictionaryValueId() {
        return dictionaryValueId;
    }

    public void setDictionaryValueId(Long dictionaryValueId) {
        this.dictionaryValueId = dictionaryValueId;
    }

    public String getDictionaryValueName() {
        return dictionaryValueName;
    }

    public void setDictionaryValueName(String dictionaryValueName) {
        this.dictionaryValueName = dictionaryValueName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
