# Getting started

R1 Plus Schemaless  API Services

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

## How to Use

The following section explains how to use the OsduR1 library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *OsduR1Lib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

Clicking the ``` Add ``` button will open a dialog where you need to specify OsduR1 in ``` Group Id ``` and OsduR1Lib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=osdu-r1-Java&workspaceName=OsduR1&projectName=OsduR1Lib&rootNamespace=com.example)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *OsduR1Lib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

OsduR1Client client = new OsduR1Client();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [IngestionClientController](#ingestion_client_controller)
* [WorkflowAPIController](#workflow_api_controller)
* [CollectionAPIController](#collection_api_controller)
* [DeliveryAPIController](#delivery_api_controller)

## <a name="ingestion_client_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.IngestionClientController") IngestionClientController

### Get singleton instance

The singleton instance of the ``` IngestionClientController ``` class can be accessed from the API Client.

```java
IngestionClientController ingestionClient = client.getIngestionClient();
```

### <a name="create_load_manifests_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createLoadManifestsAsync") createLoadManifestsAsync

> loadManifests


```java
void createLoadManifestsAsync(
        final Body3 body,
        final APICallBack<InlineResponse2001> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { ManifestFolderPath*, FilesToProcess, PipelineID } |


#### Example Usage

```java
try {
    Body3 body = new Body3();
    // Invoking the API call with sample inputs
    ingestionClient.createLoadManifestsAsync(body, new APICallBack<InlineResponse2001>() {
        public void onSuccess(HttpContext context, InlineResponse2001 response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 409 | CONFLICT |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="update_workflow_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.updateWorkflowAsync") updateWorkflowAsync

> updateWorkflow


```java
void updateWorkflowAsync(
        final Body4 body,
        final APICallBack<GenericResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { id* } ID of the Parent Workflow Document that needs to be marked as Completed |


#### Example Usage

```java
try {
    Body4 body = new Body4();
    // Invoking the API call with sample inputs
    ingestionClient.updateWorkflowAsync(body, new APICallBack<GenericResponse>() {
        public void onSuccess(HttpContext context, GenericResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_get_status_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createGetStatusAsync") createGetStatusAsync

> getStatus


```java
void createGetStatusAsync(
        final Body5 body,
        final APICallBack<GenericResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { WorkflowID* } ID of the Workflow Document |


#### Example Usage

```java
try {
    Body5 body = new Body5();
    // Invoking the API call with sample inputs
    ingestionClient.createGetStatusAsync(body, new APICallBack<GenericResponse>() {
        public void onSuccess(HttpContext context, GenericResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_geti_ingestion_workflows_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createGetiIngestionWorkflowsAsync") createGetiIngestionWorkflowsAsync

> getiIngestionWorkflows


```java
void createGetiIngestionWorkflowsAsync(
        final Body6 body,
        final APICallBack<List<ParentWorkflow>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Optional ```  | { ParentWorkflowID, UserEmail } |


#### Example Usage

```java
try {
    Body6 body = new Body6();
    // Invoking the API call with sample inputs
    ingestionClient.createGetiIngestionWorkflowsAsync(body, new APICallBack<List<ParentWorkflow>>() {
        public void onSuccess(HttpContext context, List<ParentWorkflow> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_reset_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createResetAsync") createResetAsync

> reset


```java
void createResetAsync(final APICallBack<GenericResetResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
ingestionClient.createResetAsync(new APICallBack<GenericResetResponse>() {
    public void onSuccess(HttpContext context, GenericResetResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_validate_workflow_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createValidateWorkflowAsync") createValidateWorkflowAsync

> validateWorkflow


```java
void createValidateWorkflowAsync(
        final Body7 body,
        final APICallBack<GenericResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { ParentWorkflowID* } ID of the Parent Workflow Document |


#### Example Usage

```java
try {
    Body7 body = new Body7();
    // Invoking the API call with sample inputs
    ingestionClient.createValidateWorkflowAsync(body, new APICallBack<GenericResponse>() {
        public void onSuccess(HttpContext context, GenericResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_ingestion_pipeline_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createIngestionPipelineAsync") createIngestionPipelineAsync

> createIngestionPipeline


```java
void createIngestionPipelineAsync(
        final PipelineCreate body,
        final APICallBack<PipelineGenericResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { pipelineName* , description* , createdBy* , manifestFolderPath* } |


#### Example Usage

```java
try {
    PipelineCreate body = new PipelineCreate();
    // Invoking the API call with sample inputs
    ingestionClient.createIngestionPipelineAsync(body, new APICallBack<PipelineGenericResponse>() {
        public void onSuccess(HttpContext context, PipelineGenericResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="update_ingestion_pipeline_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.updateIngestionPipelineAsync") updateIngestionPipelineAsync

> updateIngestionPipeline


```java
void updateIngestionPipelineAsync(
        final PipelineUpdate body,
        final APICallBack<PipelineGenericResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { id* , pipelineName* , description* , createdBy* , manifestFolderPath* } |


#### Example Usage

```java
try {
    PipelineUpdate body = new PipelineUpdate();
    // Invoking the API call with sample inputs
    ingestionClient.updateIngestionPipelineAsync(body, new APICallBack<PipelineGenericResponse>() {
        public void onSuccess(HttpContext context, PipelineGenericResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_view_ingestion_pipeline_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createViewIngestionPipelineAsync") createViewIngestionPipelineAsync

> Fetches all the available pipelines in the Cosmos DB collection


```java
void createViewIngestionPipelineAsync(
        final Body7 body,
        final APICallBack<List<Pipeline>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Optional ```  | { id } - ID of the pipeline document |


#### Example Usage

```java
try {
    Body7 body = new Body7();
    // Invoking the API call with sample inputs
    ingestionClient.createViewIngestionPipelineAsync(body, new APICallBack<List<Pipeline>>() {
        public void onSuccess(HttpContext context, List<Pipeline> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_delete_ingestion_pipeline_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createDeleteIngestionPipelineAsync") createDeleteIngestionPipelineAsync

> Delete Ingestion Pipeline


```java
void createDeleteIngestionPipelineAsync(
        final Body4 body,
        final APICallBack<PipelineGenericResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { id* } - ID of the pipeline document |


#### Example Usage

```java
try {
    Body4 body = new Body4();
    // Invoking the API call with sample inputs
    ingestionClient.createDeleteIngestionPipelineAsync(body, new APICallBack<PipelineGenericResponse>() {
        public void onSuccess(HttpContext context, PipelineGenericResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_get_pipeline_workflow_status_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.IngestionClientController.createGetPipelineWorkflowStatusAsync") createGetPipelineWorkflowStatusAsync

> Get the status of Parentworkflow document(s) associated with the given pipeline ID


```java
void createGetPipelineWorkflowStatusAsync(
        final Body10 body,
        final APICallBack<List<ParentWorkflow>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Optional ```  | { pipelineId } - ID of the pipeline document |


#### Example Usage

```java
try {
    Body10 body = new Body10();
    // Invoking the API call with sample inputs
    ingestionClient.createGetPipelineWorkflowStatusAsync(body, new APICallBack<List<ParentWorkflow>>() {
        public void onSuccess(HttpContext context, List<ParentWorkflow> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



[Back to List of Controllers](#list_of_controllers)

## <a name="workflow_api_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.WorkflowAPIController") WorkflowAPIController

### Get singleton instance

The singleton instance of the ``` WorkflowAPIController ``` class can be accessed from the API Client.

```java
WorkflowAPIController workflowAPI = client.getWorkflowAPI();
```

### <a name="create_describe_workflow_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.WorkflowAPIController.createDescribeWorkflowAsync") createDescribeWorkflowAsync

> DescribeWorkflow


```java
void createDescribeWorkflowAsync(
        final DescribeWorkflowPayload body,
        final APICallBack<DescribeWorkflowResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { WorkflowJobID* } - ID of the workflow document |


#### Example Usage

```java
try {
    DescribeWorkflowPayload body = new DescribeWorkflowPayload();
    // Invoking the API call with sample inputs
    workflowAPI.createDescribeWorkflowAsync(body, new APICallBack<DescribeWorkflowResponse>() {
        public void onSuccess(HttpContext context, DescribeWorkflowResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_startsmdsloadingworkflow_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.WorkflowAPIController.createStartsmdsloadingworkflowAsync") createStartsmdsloadingworkflowAsync

> StartSMDSLoadingWorkflow


```java
void createStartsmdsloadingworkflowAsync(
        final SMDSWorkflowPayload body,
        final APICallBack<GenericResponse200> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { ResourceTypeID* , Manifest* } |


#### Example Usage

```java
try {
    SMDSWorkflowPayload body = new SMDSWorkflowPayload();
    // Invoking the API call with sample inputs
    workflowAPI.createStartsmdsloadingworkflowAsync(body, new APICallBack<GenericResponse200>() {
        public void onSuccess(HttpContext context, GenericResponse200 response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_describesmdsloadingworkflow_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.WorkflowAPIController.createDescribesmdsloadingworkflowAsync") createDescribesmdsloadingworkflowAsync

> DescribeSMDSLoadingWorkflow


```java
void createDescribesmdsloadingworkflowAsync(
        final DescribeWorkflowPayload body,
        final APICallBack<DescribeWorkflowResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { WorkflowJobID* } - ID of the workflow document |


#### Example Usage

```java
try {
    DescribeWorkflowPayload body = new DescribeWorkflowPayload();
    // Invoking the API call with sample inputs
    workflowAPI.createDescribesmdsloadingworkflowAsync(body, new APICallBack<DescribeWorkflowResponse>() {
        public void onSuccess(HttpContext context, DescribeWorkflowResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_describeswpsloadingworkflow_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.WorkflowAPIController.createDescribeswpsloadingworkflowAsync") createDescribeswpsloadingworkflowAsync

> DescribeSWPSLoadingWorkflow


```java
void createDescribeswpsloadingworkflowAsync(
        final DescribeWorkflowPayload body,
        final APICallBack<DescribeWorkflowResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { WorkflowJobID* } - ID of the workflow document |


#### Example Usage

```java
try {
    DescribeWorkflowPayload body = new DescribeWorkflowPayload();
    // Invoking the API call with sample inputs
    workflowAPI.createDescribeswpsloadingworkflowAsync(body, new APICallBack<DescribeWorkflowResponse>() {
        public void onSuccess(HttpContext context, DescribeWorkflowResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_startswpsloadingworkflow_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.WorkflowAPIController.createStartswpsloadingworkflowAsync") createStartswpsloadingworkflowAsync

> StartSWPSLoadingWorkflow


```java
void createStartswpsloadingworkflowAsync(
        final SWPSWorkflowPayload body,
        final APICallBack<GenericResponse200> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { ResourceTypeID* , Manifest* } - ID of the workflow document |


#### Example Usage

```java
try {
    SWPSWorkflowPayload body = new SWPSWorkflowPayload();
    // Invoking the API call with sample inputs
    workflowAPI.createStartswpsloadingworkflowAsync(body, new APICallBack<GenericResponse200>() {
        public void onSuccess(HttpContext context, GenericResponse200 response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



[Back to List of Controllers](#list_of_controllers)

## <a name="collection_api_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.CollectionAPIController") CollectionAPIController

### Get singleton instance

The singleton instance of the ``` CollectionAPIController ``` class can be accessed from the API Client.

```java
CollectionAPIController collectionAPI = client.getCollectionAPI();
```

### <a name="createcollection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CollectionAPIController.createcollectionAsync") createcollectionAsync

> createCollection


```java
void createcollectionAsync(
        final CollectionCreate body,
        final APICallBack<InlineResponse200> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { OwnerID, Name, Description, WorkSpaceID, Resources, FilterSpecification } |


#### Example Usage

```java
try {
    CollectionCreate body = new CollectionCreate();
    // Invoking the API call with sample inputs
    collectionAPI.createcollectionAsync(body, new APICallBack<InlineResponse200>() {
        public void onSuccess(HttpContext context, InlineResponse200 response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="updatecollection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CollectionAPIController.updatecollectionAsync") updatecollectionAsync

> updateCollection


```java
void updatecollectionAsync(
        final CollectionUpdate body,
        final APICallBack<InlineResponse200> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { SRN*, OwnerID, Name, Description, WorkSpaceID, Resources, FilterSpecification } |


#### Example Usage

```java
try {
    CollectionUpdate body = new CollectionUpdate();
    // Invoking the API call with sample inputs
    collectionAPI.updatecollectionAsync(body, new APICallBack<InlineResponse200>() {
        public void onSuccess(HttpContext context, InlineResponse200 response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_get_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CollectionAPIController.createGetCollectionAsync") createGetCollectionAsync

> getCollection


```java
void createGetCollectionAsync(
        final Body body,
        final APICallBack<MCollection> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { SRN* } |


#### Example Usage

```java
try {
    Body body = new Body();
    // Invoking the API call with sample inputs
    collectionAPI.createGetCollectionAsync(body, new APICallBack<MCollection>() {
        public void onSuccess(HttpContext context, MCollection response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_delete_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CollectionAPIController.createDeleteCollectionAsync") createDeleteCollectionAsync

> deleteCollection


```java
void createDeleteCollectionAsync(
        final Body1 body,
        final APICallBack<GenericResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { SRN* } |


#### Example Usage

```java
try {
    Body1 body = new Body1();
    // Invoking the API call with sample inputs
    collectionAPI.createDeleteCollectionAsync(body, new APICallBack<GenericResponse>() {
        public void onSuccess(HttpContext context, GenericResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



### <a name="create_list_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.CollectionAPIController.createListCollectionAsync") createListCollectionAsync

> listCollection


```java
void createListCollectionAsync(
        final Body2 body,
        final APICallBack<List<MCollection>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { OwnerID* } |


#### Example Usage

```java
try {
    Body2 body = new Body2();
    // Invoking the API call with sample inputs
    collectionAPI.createListCollectionAsync(body, new APICallBack<List<MCollection>>() {
        public void onSuccess(HttpContext context, List<MCollection> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



[Back to List of Controllers](#list_of_controllers)

## <a name="delivery_api_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.example.controllers.DeliveryAPIController") DeliveryAPIController

### Get singleton instance

The singleton instance of the ``` DeliveryAPIController ``` class can be accessed from the API Client.

```java
DeliveryAPIController deliveryAPI = client.getDeliveryAPI();
```

### <a name="create_get_resources_async"></a>![Method: ](https://apidocs.io/img/method.png "com.example.controllers.DeliveryAPIController.createGetResourcesAsync") createGetResourcesAsync

> GetResources


```java
void createGetResourcesAsync(
        final GetResourceRequest body,
        final APICallBack<GetResourceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | { SRNS*, TargetRegionID } |


#### Example Usage

```java
try {
    GetResourceRequest body = new GetResourceRequest();
    // Invoking the API call with sample inputs
    deliveryAPI.createGetResourcesAsync(body, new APICallBack<GetResourceResponse>() {
        public void onSuccess(HttpContext context, GetResourceResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | BAD_REQUEST |
| 500 | INTERNAL_SERVER_ERROR |



[Back to List of Controllers](#list_of_controllers)



