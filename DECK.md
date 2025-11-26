---
Title: Project management
Description: plans and project management sheets
Date: 
Robots: noindex,nofollow
Template: index
---

# Java containers

Abbreviations
> * PM Product Milestone
> * MD Milestone division
> * SD Subdivision

## Analyzing all parts

|#|Part|Details|Total Duration|Status|
|:-|:-|:-|:-|:-|
|1|[Part 1](%base_url%/pm#Part_1_timeplan)|2025-11-25 - |- hours|ONGOING|
|:-|:-|:-|::||


## Part 1 timeplan

```mermaid
gantt
    section MD1
    SD1 - Create pm file and init repo                 :done,md1des1, 2025-11-25,1d
    SD2 - Create containers              :md1des2, after md1des1,1d
    SD3 - Document          :md1des3, after md1des2,1d

```

# Stories/cards MD1

## 48-001
### Goal : Create pm files and init repo
The goal of this card is to create a deck file to manage job.
It also aims to create a new repo on github and update git hooks.

### DOD  (definition of done):
A new repo named `containers` is created.
A `DECK.MD` with needed stories added to the created repo

### TODO :
- [x] 1. Create a repo name `containers`
- [x] 2. Add a deck file
- [x] 3. Update Deck with needed stories
- [x] 4. Update time plan

### Reports :
* 

#### Steps to test and debugging:
- [] 1.

#### References :
* []()
---

## 48-002
### Goal : Create containers
The goal of this card is to created needed containers,

### DOD  (definition of done):
Three containers (openjdk, maven and tomcat) are created.

### TODO :
- [x] 1. openjdk
- [x] 2. maven
- [x] 3. tomcat
- [x] 4. Add a readme file
- [] 5. Update time plan

### Reports :
* An openjdk container based on Alpine and openjdk was created
* The version of the openjdk is 21, the leates version available for Alpine is 21
* A Maven container based on openjdk 21 and Alpine 3.20 was created
* 3 examples for different purposes was coded added to the container folder
> * my-app : A general code to use java under Maven
> * my-springapp - A simple java app that is based on spring framework
> * my-webapp - A simple project temlate (no java code included) to run under Tomcat
* A Tomcat container based on Alpine 3.20 was created

#### Steps to test and debugging:
- [] 1.

#### References :
* []()
---

## 48-003
### Goal : Document the creted containers
The goal of this card is to add a README.md and documents usages and containers' details.

### DOD  (definition of done):
A README is added to the repo

### TODO :
- [ ] 1. Add readme file
- [ ] 2. Update time plan

### Reports :
* 

#### Steps to test and debugging:
- [] 1.

#### References :
* []()
---