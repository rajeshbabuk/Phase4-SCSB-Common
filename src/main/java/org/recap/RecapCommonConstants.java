package org.recap;

public class RecapCommonConstants {
    private RecapCommonConstants() {}
    public static final String API_KEY = "api_key";
    public static final String RECAP = "recap";
    public static final String FAILURE = "Failure";
    public static final String SUCCESS = "Success";
    public static final String ITEM_BARCDE_DOESNOT_EXIST = "Item barcode doesn't exist in SCSB database.";
    public static final String COLUMBIA = "CUL";
    public static final String PRINCETON = "PUL";
    public static final String NYPL = "NYPL";
    public static final String RESPONSE_DATE = "Date";
    public static final String REQUEST_TYPE_RETRIEVAL = "RETRIEVAL";
    public static final String REQUEST_TYPE_EDD = "EDD";
    public static final String REQUEST_TYPE_BORROW_DIRECT = "BORROW DIRECT";
    public static final String REQUEST_TYPE_RECALL = "RECALL";
    public static final String REQUEST_TYPE_QUEUE_HEADER = "RequestType";
    public static final String BULK_REQUEST_ITEM_QUEUE = "scsbactivemq:queue:BulkRequestItemQ";
    public static final String URL_SCHEDULE_JOBS= "scheduleService/scheduleJob";
    public static final String INPUT_RECORDS = "inputRecords";
    public static final String INSTITUTION = "institution";
    public static final String IS_CGD_PROTECTED = "isCGDProtected";
    public static final String CGD_UPDATE_ITEM_BARCODE = "itemBarcode";
    public static final String OLD_CGD = "oldCollectionGroupDesignation";
    public static final String NEW_CGD = "newCollectionGroupDesignation";
    public static final String CGD_CHANGE_NOTES = "cgdChangeNotes";
    public static final String USER_NAME = "userName";
    public static final String REQUEST_EXCEPTION_REST = "RestClient : ";
    public static final String REQUEST_EXCEPTION = "Exception : ";
    public static final String SCSB_SOLR_CLIENT_SERVICE_UNAVAILABLE = "Scsb Solr Client Service is Unavailable.";
    public static final String LOG_ERROR = "Error--> ";
    public static final String COMPLETE_STATUS = "Complete";
    public static final String REQUEST_MESSAGE_RECEVIED = "Message received, your request will be processed";
    public static final String PURGE_EXCEPTION_REQUESTS = "PurgeExceptionRequests";
    public static final String STATUS = "Status";
    public static final String PATH_SEPARATOR = "/";
    public static final String PROCESSSED_RECORDS = "processedRecords";
    public static final String ALL = "*";
    public static final String DOCTYPE = "DocType";
    public static final String BIB = "Bib";
    public static final String ITEM = "Item";
    public static final String HOLDINGS = "Holdings";
    public static final String HOLDINGS_ID = "HoldingsId";
    public static final String HOLDING_ID = "HoldingId";
    public static final String ITEM_ID = "ItemId";
    public static final String SEARCH = "search";
    public static final String PRIVATE = "Private";
    public static final String BIB_OWNING_INSTITUTION = "BibOwningInstitution";
    public static final String HOLDINGS_OWNING_INSTITUTION = "HoldingsOwningInstitution";
    public static final String ITEM_OWNING_INSTITUTION = "ItemOwningInstitution";
    public static final String OWNING_INSTITUTION = "OwningInstitution";
    public static final String COLLECTION_GROUP_DESIGNATION = "CollectionGroupDesignation";
    public static final String AVAILABILITY = "Availability_search";
    public static final String TITLE_SEARCH = "Title_search";
    public static final String AUTHOR_SEARCH = "Author_search";
    public static final String PUBLISHER = "Publisher";
    public static final String TITLE_STARTS_WITH= "TitleStartsWith";
    public static final String TITLE_SORT= "Title_sort";
    public static final String BARCODE = "Barcode";
    public static final String CALL_NUMBER = "CallNumber_search";
    public static final String NOTES = "Notes";
    public static final String MONOGRAPH = "Monograph";
    public static final String LEADER_MATERIAL_TYPE = "LeaderMaterialType";
    public static final String SERIAL = "Serial";
    public static final String OTHER = "Other";
    public static final String AND = "AND";
    public static final String OR = "OR";
    public static final String ALL_DIACRITICS = "all_diacritics";
    public static final String ALL_FIELDS = "_text_";
    public static final String IS_DELETED_BIB = "IsDeletedBib";
    public static final String IS_DELETED_HOLDINGS = "IsDeletedHoldings";
    public static final String IS_DELETED_ITEM = "IsDeletedItem";
    public static final String PUBLICATION_DATE = "PublicationDate";
    public static final String USE_RESTRICTION = "UseRestriction_search";
    public static final String NO_RESTRICTIONS = "No Restrictions";
    public static final String IN_LIBRARY_USE = "In Library Use";
    public static final String SUPERVISED_USE = "Supervised Use";
    public static final String COLLECTION_GROUP_CODE = "CollectionGroupCode";
    public static final String REASON_FOR_FAILURE = "ReasonForFailure";
    public static final String REASON_FOR_FAILURE_BIB = "ReasonForFailureBib";
    public static final String REASON_FOR_FAILURE_HOLDING = "ReasonForFailureHolding";
    public static final String REASON_FOR_FAILURE_ITEM = "ReasonForFailureItem";
    public static final String INCREMENTAL_DATE_FORMAT = "dd-MM-yyyy hh:mm";
    public static final String CSV_SOLR_EXCEPTION_REPORT_Q = "scsbactivemq:queue:csvSolrExceptionReportQ";
    public static final String FTP_SOLR_EXCEPTION_REPORT_Q = "scsbactivemq:queue:ftpSolrExceptionReportQ";
    public static final String REPORT_Q= "scsbactivemq:queue:reportQ";
    public static final String SOLR_QUEUE = "scsbactivemq:queue:solrQ";
    public static final String FS_SUBMIT_COLLECTION_REJECTION_REPORT_Q = "scsbactivemq:queue:fsSubmitCollectionRejectionReportQ";
    public static final String FTP_SUBMIT_COLLECTION_REJECTION_REPORT_Q = "scsbactivemq:queue:ftpSubmitCollectionRejectionReportQ";
    public static final String CSV_SOLR_EXCEPTION_REPORT_ROUTE_ID = "csvSolrExceptionReportRoute";
    public static final String FTP_SOLR_EXCEPTION_REPORT_ROUTE_ID = "ftpSolrExceptionReportRoute";
    public static final String REPORT_ROUTE_ID = "reportQRoute";
    public static final String MATCHING_ALGO_FULL_FILE_NAME = "Matching_Algo_Phase1";
    public static final String REPORT_FILE_NAME = "fileName";
    public static final String MATCH_POINT_FIELD_OCLC = "OCLCNumber";
    public static final String MATCH_POINT_FIELD_ISBN = "ISBN";
    public static final String MATCH_POINT_FIELD_ISSN = "ISSN";
    public static final String MATCH_POINT_FIELD_LCCN = "LCCN";
    public static final String ALL_INST = "ALL";
    public static final String OCLC_TAG = "035";
    public static final String ISBN_TAG = "020";
    public static final String ISSN_TAG = "022";
    public static final String LCCN_TAG = "010";
    public static final String FILE_SYSTEM = "FileSystem";
    public static final String FTP = "FTP";
    public static final String NOT_AVAILABLE_CGD = "NA";
    public static final String SHARED_CGD = "Shared";
    public static final String OCLC_CRITERIA = "OCLC";
    public static final String ISBN_CRITERIA = "ISBN";
    public static final String ISSN_CRITERIA = "ISSN";
    public static final String LCCN_CRITERIA = "LCCN";
    public static final String OCLC_NUMBER = "OCLCNumber";
    public static final String BIB_COUNT = "bibCount";
    public static final String ITEM_COUNT = "itemCount";
    public static final String BIB_ITEM_COUNT = "bibItemCount";
    public static final String EXCEPTION_MSG = "ExceptionMessage";
    public static final String ACCESS_RESTRICTED="User is not permitted to access this record";
    public static final String SEARCH_SUCCESS_RESPONSE = "SuccessResponse";
    public static final String SEARCH_ERROR_RESPONSE = "ErrorResponse";
    public static final String SOLR_CORE = "solrCore";
    public static final String SOLR_INDEX_FAILURE_REPORT = "Solr_Index_Failure_Report";
    public static final String SOLR_INDEX_EXCEPTION = "SolrIndexException";
    public static final String OWNING_INST_BIB_ID = "OwningInstitutionBibId";
    public static final String BIB_ID = "BibId";
    public static final String NA = "NA";
    public static final String UPDATE_CGD = "Update CGD";
    public static final String DEACCESSION = "Deaccession";
    public static final String TEMPLATE = "template";
    public static final String COLLECTION = "collection";
    public static final String REQUEST = "request";
    public static final String GUEST = "guest";
    public static final String ITEM_BARCODES = "itemBarcodes";
    public static final String AVAILABLE = "Available";
    public static final String NOT_AVAILABLE = "Not Available";
    public static final String PERMANENT_WITHDRAWAL_DIRECT = "Permanent Withdrawal Direct (PWD)";
    public static final String PERMANENT_WITHDRAWAL_INDIRECT = "Permanent Withdrawal Indirect (PWI)";
    public static final String DEACCESSION_URL = "sharedCollection/deAccession";
    public static final String NO_RESULTS_FOUND = "No results found.";
    public static final String BARCODES_NOT_FOUND = "Barcode(s) not found";
    public static final String CGD_UPDATE_SUCCESSFUL = "The CGD has been successfully updated.";
    public static final String CGD_UPDATE_FAILED = "Updating CGD failed";
    public static final String DEACCESSION_SUCCESSFUL = "The item has been successfully deaccessioned.";
    public static final String DEACCESSION_FAILED = "Deaccessioning the item failed";
    public static final int BARCODE_LIMIT = 10;
    public static final String REQUEST_ID = "requestId";
    public static final String SEARCH_RESULT_ERROR_NO_RECORDS_FOUND="No search results found. Please refine search conditions.";
    public static final String SEARCH_RESULT_ERROR_INVALID_CHARACTERS="No search results found. Search conditions, has invalid characters (double quotes [\"],open parenthesis [(], backslash [\\], curly braces[{}] and caret [^). Please refine search conditions.";
    public static final String CUSTOMER_CODE_DOESNOT_EXIST = "Customer Code doesn't exist in SCSB database.";
    public static final String OWNING_INSTITUTION_BIB_ID = "OwningInstitutionBibId";
    public static final String TITLE = "Title";
    public static final String OWNING_INSTITUTION_HOLDINGS_ID = "OwningInstitutionHoldingsId";
    public static final String LOCAL_ITEM_ID = "LocalItemId";
    public static final String ITEMBARCODE = "itemBarcode";
    public static final String CUSTOMER_CODE = "CustomerCode";
    public static final String CREATE_DATE_ITEM = "CreateDateItem";
    public static final String LAST_UPDATED_DATE_ITEM = "LastUpdatedDateItem";
    public static final String ERROR_DESCRIPTION = "ErrorDescription";
    public static final String ITEM_BARCODE = "ItemBarcode";
    public static final String REQUESTED_ITEM_DEACCESSIONED = "The requested item has already been deaccessioned.";
    public static final String DATE_OF_DEACCESSION = "DateOfDeAccession";
    public static final String DATE_OF_ACCESSION = "DateOfAccession";
    public static final String FS_DE_ACCESSION_SUMMARY_REPORT_Q = "scsbactivemq:queue:fsDeAccessionSummaryReportQ";
    public static final String FTP_ACCESSION_SUMMARY_REPORT_Q = "scsbactivemq:queue:ftpAccessionSummaryReportQ";
    public static final String FS_ACCESSION_SUMMARY_REPORT_ID = "fsAccessionSummaryReportQ";
    public static final String FTP_ACCESSION_SUMMARY_REPORT_ID = "ftpAccessionSummaryReportQ";
    public static final String DEACCESION_DATE_FORMAT_FOR_FILE_NAME = "ddMMMyyyyHHmmss";
    public static final String ACCESSION_SUMMARY_REPORT = "Accession_Summary_Report";
    public static final String DEACCESSION_SUMMARY_REPORT = "DeAccession_Summary_Report";
    public static final String DEACCESSION_REPORT = "DeAccession_Report";
    public static final String ACCESSION_REPORT = "Accession_Report";
    public static final String SUCCESS_BIB_COUNT = "successBibCount";
    public static final String FAILED_BIB_COUNT = "failedBibCount";
    public static final String SUCCESS_ITEM_COUNT = "successItemCount";
    public static final String FAILED_ITEM_COUNT = "failedItemCount";
    public static final String EXIST_BIB_COUNT = "exitsBibCount";
    public static final String REASON_FOR_BIB_FAILURE = "reasonForFailureBib";
    public static final String REASON_FOR_ITEM_FAILURE = "reasonForFailureItem";
    public static final String BIB_SUCCESS_COUNT = "SuccessBibCount";
    public static final String ITEM_SUCCESS_COUNT = "SuccessItemCount";
    public static final String BIB_FAILURE_COUNT = "FailedBibCount";
    public static final String ITEM_FAILURE_COUNT = "FailedItemCount";
    public static final String NUMBER_OF_BIB_MATCHES = "NoOfBibMatches";
    public static final String SUBMIT_COLLECTION_REPORT = "Submit_Coll";
    public static final String SUBMIT_COLLECTION_REJECTION_REPORT = "Submit_Collection_Rejection_Report";
    public static final String SUBMIT_COLLECTION_EXCEPTION_REPORT = "Submit_Collection_Exception_Report";
    public static final String SUBMIT_COLLECTION_SUCCESS_REPORT = "Submit_Collection_Success_Report";
    public static final String SUBMIT_COLLECTION_FAILURE_REPORT = "SubmitCollection_Failure_Report";
    public static final String FAIL = "Fail";
    public static final String SUBMIT_COLLECTION_ITEM_BARCODE= "ItemBarcode";
    public static final String SUBMIT_COLLECTION_CUSTOMER_CODE= "CustomerCode";
    public static final String ACCESSION = "accession";
    public static final String DUMMYCALLNUMBER = "dummycallnumber";
    public static final String INCOMPLETE_STATUS = "Incomplete";
    public static final String BIBLIOGRAPHICENTITY = "bibliographicEntity";
    public static final String REPORTENTITIES = "reportEntities";
    public static final String ONGOING_MATCHING_ALGORITHM_JOB = "ongoingMatchingAlgorithmJob";
    public static final String DATE_FORMAT_YYYYMMDDHHMM = "yyyy-MM-dd HH:mm";
    public static final String UTC_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public static final String UTC = "UTC";
    public static final String SOLR_DATE_RANGE_TO_NOW = " TO NOW";
    public static final String SIMPLE_DATE_FORMAT_REPORTS = "MM/dd/yyyy";
    public static final String REPORTS = "reports";
    public static final String REPORTS_REQUEST = "request";
    public static final String REPORTS_IL_BD = "IL_BD";
    public static final String REPORTS_PARTNERS = "Partners";
    public static final String REPORTS_REQUEST_TYPE = "RequestType";
    public static final String REPORTS_ACCESSION_DEACCESSION = "Accession/Deaccesion";
    public static final String REPORTS_DEACCESSION = "Deaccession";
    public static final String REPORTS_RETRIEVAL = "Retrieval";
    public static final String REPORTS_RECALL = "Recall";
    public static final String REPORTS_OPEN = "Open";
    public static final String REPORTS_PRIVATE = "Private";
    public static final String REPORTS_SHARED = "Shared";
    public static final String RETRIEVAL = "RETRIEVAL";
    public static final String RECALL = "RECALL";
    public static final String EDD = "EDD";
    public static final String BORROW_DIRECT = "BORROW DIRECT";
    public static final String MESSAGE = "Message";
    public static final String HYPHEN = " - ";
    public static final String REQUEST_STATUS = "RequestStatus";
    public static final String REQUEST_STATUS_RECALLED = "RECALL_ORDER_PLACED";
    public static final String REQUEST_STATUS_RETRIEVAL_ORDER_PLACED = "RETRIEVAL_ORDER_PLACED";
    public static final String SUBMIT_COLLECTION_SUMMARY = "SubmitCollectionSummary";
    public static final String SFTP = "sftp://";
    public static final String AT = "@";
    public static final String PRIVATE_KEY_FILE = "?privateKeyFile=";
    public static final String KNOWN_HOST_FILE = "&knownHostsFile=";
    public static final String OWN_INSTITUTION_ID = "institutionId";
    public static final String LAS_REJECTED = "LAS has rejected";
    public static final String LAS_SERVER_NOT_REACHABLE = "LAS server is not reachable";
    public static final String ACCESSION_NO_PENDING_REQUESTS = "No pending requests to process accession.";
    public static final String REQUEST_STATUS_EDD = "EDD_ORDER_PLACED";
    public static final String REQUEST_STATUS_INITIAL_LOAD = "INITIAL_LOAD";
    public static final String REQUEST_STATUS_REFILED = "REFILED";
    public static final String REQUEST_STATUS_CANCELED = "CANCELED";
    public static final String BULK_REQUEST_ID = "bulkRequestId";
    public static final String BULK_REQUEST_PRIVILEGE = "isBulkRequestAllowed";
    public static final String RESUBMIT_REQUEST_PRIVILEGE = "isReSubmitRequestAllowed";
    public static final String ACCESSION_JOB_INITIATE_QUEUE = "scsbactivemq:queue:accessionInitiateQ";
    public static final String ACCESSION_JOB_COMPLETION_OUTGOING_QUEUE = "scsbactivemq:queue:accessionCompletionOutgoingQ";
    public static final String MATCHING_ALGORITHM_JOB_INITIATE_QUEUE = "scsbactivemq:queue:matchingAlgorithmInitiateQ";
    public static final String MATCHING_ALGORITHM_JOB_COMPLETION_OUTGOING_QUEUE = "scsbactivemq:queue:matchingAlgorithmCompletionOutgoingQ";
    public static final String JOB_ID = "jobId";
    public static final String PROCESS_TYPE = "processType";
    public static final String CREATED_DATE = "createdDate";
    public static final String TOTAL_REQUESTS_FOUND = "TotalRequestsFound";
    public static final String TOTAL_REQUESTS_IDS = "TotalRequestIds";
    public static final String INVALID_REQUEST = "InvalidRequest";
    public static final String REQUEST_IDS = "RequestIds";
    public static final String DIRECT_ROUTE_FOR_EXCEPTION = "direct:Exception";
    public static final String ROOT = "_root_";
    public static final String PURGE_EDD_REQUEST = "noOfUpdatedRecordsForEddRequest";
    public static final String OWN_INST_BIBID_LIST = "owningInstBibIdList";
    public static final String SUBMIT_COLLECTION_JOB_INITIATE_QUEUE = "scsbactivemq:queue:submitCollectionInitiateQ";
    public static final String ONGOING_MATCHING_ALGORITHM = "OngoingMatchingAlgorithm";
    public static final String SUBMIT_COLLECTION_JOB_COMPLETION_OUTGOING_QUEUE = "scsbactivemq:queue:submitCollectionCompletionOutgoingQ";
    public static final String PURGE_PHYSICAL_REQUEST = "noOfUpdatedRecordsForPhysicalRequest";
    public static final String REGEX_FOR_EMAIL_ADDRESS = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String FILE_NAME = "FileName";
    public static final String  BIB_LASTUPDATED_DATE = "BibLastUpdatedDate";
    public static final String  BIBITEM_LASTUPDATED_DATE = "BibItemLastUpdatedDate";
    public static final String  ITEM_LASTUPDATED_DATE = "ItemLastUpdatedDate";
    public static final String CAMEL_BATCH_COMPLETE = "CamelBatchComplete";
    public static final String CGD_CHANGE_LOG_SHARED_TO_PRIVATE = "SharedToPrivate";
    public static final String CGD_CHANGE_LOG_OPEN_TO_PRIVATE = "OpenToPrivate";
    public static final String DATE_FORMAT_FOR_FILE_NAME = "ddMMMyyyy";
    public static final String VALID_REQUEST = "All request parameters are valid.Patron is eligible to raise a request";
    public static final String MARC_DATA_LOAD_NAMESPACE = "http://www.loc.gov/MARC21/slim";
    public static final String RESPONSE_HEADER_CONTENT_TYPE= "Content-Type";
    public static final String RESPONSE_HEADER_CONTENT_TYPE_VALUE= "text/plain;charset=UTF-8";

    /* Institution and Protocol Specific Properties */
    public static final String SIP2_PROTOCOL = "SIP2";
    public static final String NCIP_PROTOCOL = "NCIP";
    public static final String REST_PROTOCOL = "REST";
    public static final String PROTOCOL = "protocol";

    /* IMS Location Specific Properties */
    public static final String IMS_LOCATION_UNKNOWN = "UN";

    /* ActiveMQ Component Name */
    public static final String SCSB_ACTIVEMQ_COMPONENT_NAME = "scsbactivemq";
}
