Original App Design Project - README Template
===

# Roomie

Team members: Jiangxue Han, Anubhuv Sharma, Kevin Sang, Yikang Lin

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
This is an app that helps people who are living together to easily assign day-to-day housework to each other. 

### App Evaluation
- **Category:** Lifestyle, Productivity, Tool
- **Mobile:** 
    - Real-time: Users can create and share their tasks via the app so that others can edit and/or view them in real time.
    - Push: Users can set up push notification so that they can be reminded to complete tasks.
    - Accessible: Users can repeatedly access tasks that have been created easily.
- **Story:** Allows housemates to assign houseworks efficiently and serves as a way to avoid potential conflicts
- **Market:** Anyone who lives with one or more housemates, for instance, college students  and young professionals.
- **Habit:** Users can access or create tasks any time throughout the day. Reminders are set to finish the tasks, very habit forming!
- **Scope:** Roomies can start with only providing the function of creating and sharing task lists. It has the potential to expand and include user stories of notifications, reminders, history and point systems.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**
(GIFs can be find here: https://github.com/fourEyesSquad/Roomie/tree/main/GIFs)
(Unit 10 Update: Layout files created. Front end of all of the stories done.)
(Unit 11 Update: Navigation done on SignupActivity and LoginActivity. Since the networking and backend is not complete, we cannot check any of the stories off.)

- [ ] User can sign up
- [ ] User can login and logout.
- [ ] User can create groups.
- [ ] User can join groups.
- [ ] User can create new tasks.
- [ ] User can assign tasks.
- [ ] User can mark task as completed.

**Optional Nice-to-have Stories**

- [ ] User can create recurring tasks.
- [ ] User can receive notifications and reminders of their tasks.
- [ ] User can be assigned reward points based on tasks completed.
- [ ] User can have access to task history.
- [ ] User can edit tasks.

### 2. Screen Archetypes

* Log in
    * User can log in
    
* Sign up
   * User can sign up.

* Room Join/ Creation 
   * User can create or join groups.
   
* Tasks 
   * User can create new tasks.
   * User can assign tasks.
   * User can mark task as completed.
   * User can log out.

### 3. Navigation

**Flow Navigation** (Screen to Screen)

* [Log in]
   * [Room Join/ Creation]
   * [Sign up]
* [Sign up]
   * [Log in]
* [Room Join/ Creation]
    * [Tasks]
* [Tasks]
    * [Log in]

## Wireframes
[Add picture of your hand sketched wireframes in this section]
![alt text](https://github.com/fourEyesSquad/Roomie/blob/main/wireframe.png)


## Schema

### Models


#### Log In
| Property       | Type         |Description  |
| :------------- | :----------- | :----------- |
|username | String | username of the user|
| password  | String | password entered by the user |

#### Register
| Property       | Type         |Description  |
| :------------- | :----------- | :----------- |
| username | String | username of the user|
| email | String | email of the user|
| password  | String | password entered by the user |

#### Group Join/ Creation
| Property       | Type         |Description  |
| :------------- | :----------- | :----------- |
| groupID | String |the unique group Id|
| member | Pointer to User | The user associated to the room|


#### Tasks
| Property       | Type         |Description  |
| :------------- | :----------- | :----------- |
|  taskDescription    | String   | description of the task   |
|  taskID     | String   | unique ID for each task   |
|  groupID | String  | unique ID for the group    |
|  author | Pointer to User | author of the task    |
| assignee| Pointer to User   | person assigned to the task  |
| createdAt  | DateTime| date when post is created (default field) |
|updatedAt|DateTime |date when task is last updated (default field)|
| completed  | boolean | true if the task is completed |
### Networking
#### List of network requests by screen
* Task Screen
    * (read/GET) Query a list of tasks a group have.
    * (create/POST) Create a new task.
    * (delete) Delete existing task.
    * (edit) Mark a task as complete.
* Log in/Sign up Screen
    * (read/GET) Query a list of registered users
* Sign up Screen
    * (create/POST) post and store user data to backend
* Room Join/Creation Screen
    * (read/GET) Query a list of registered rooms.
    * (create/POST) Create a room and store in the backend.
