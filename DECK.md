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
|1|[Develop](%base_url%/pm#Develop_timeplan)|2025-11-25 - 2025-11-26|10 hours|DONE|
|2|[Maintenance](%base_url%/pm#Maintenance_timeplan)|2025-11-26 -|- hours|ONGOING|
|:-|:-|:-|::||


## Develop timeplan

```mermaid
gantt
    section MD1
    SD1 - Create pm file and init repo                 :done,md1des1, 2025-11-25,1d
    SD2 - Create containers              :done,md1des2, after md1des1,1d
    SD3 - Document          :done,md1des3, after md1des2,1d
```

## Maintenance timeplan

```mermaid
gantt
    section MD1
```

# Stories/cards MD1 - Develop

## 48-001
### Create pm files and init repo ![status](https://img.shields.io/badge/status-DONE-brightgreen)
<details>
    <summary>Details</summary>

>The goal of this card is to create a deck file to manage job.
>It also aims to create a new repo on github and update git hooks.
>
>### DOD  (definition of done):
>A new repo named `containers` is created.
>A `DECK.MD` with needed stories added to the created repo
>
>### TODO :
>- [x] 1. Create a repo name `containers`
>- [x] 2. Add a deck file
>- [x] 3. Update Deck with needed stories
>- [x] 4. Update time plan
>
>### Reports :
>* 
>
>#### Steps to test and debugging:
>- [] 1.
>
>#### References :
>* []()
</details>

## 48-002
### Create containers ![status](https://img.shields.io/badge/status-DONE-brightgreen)
<details>
    <summary>Details</summary>

>The goal of this card is to created needed containers,
>
>### DOD  (definition of done):
>Three containers (openjdk, maven and tomcat) are created.
>
>### TODO :
>- [x] 1. openjdk
>- [x] 2. maven
>- [x] 3. tomcat
>- [x] 4. Add a readme file
>- [x] 5. Update time plan
>
>### Reports :
>* An openjdk container based on Alpine and openjdk was created
>* The version of the openjdk is 21, the leates version available for Alpine is 21
>* A Maven container based on openjdk 21 and Alpine 3.20 was created
>* 3 examples for different purposes was coded added to the container folder
>> * my-app : A general code to use java under Maven
>> * my-springapp - A simple java app that is based on spring framework
>> * my-webapp - A simple project temlate (no java code included) to run under Tomcat
>* A Tomcat container based on Alpine 3.20 was created
>
>#### Steps to test and debugging:
>- [] 1.
>
>#### References :
>* []()
</details>

## 48-003
### Document the creted containers ![status](https://img.shields.io/badge/status-DONE-brightgreen)
<details>
    <summary>Details</summary>

>The goal of this card is to add a README.md and documents usages and containers' details.
>
>### DOD  (definition of done):
>A README is added to the repo
>
>### TODO :
>- [x] 1. Add readme file
>- [x] 2. Update time plan
>
>### Reports :
>* 
>
>#### Steps to test and debugging:
>- [] 1.
>
>#### References :
>* []()
</details>

## 48-004
### Document the creted containers ![status](https://img.shields.io/badge/status-DONE-brightgreen)
<details>
    <summary>Details</summary>

>The goal of this card is to fix some issues found on README.md and containers.
>
>### DOD  (definition of done):
>README is updated.
>All Container are fixed and updated
>
>### TODO :
>- [x] 1. Updated README with a link to this file DECK
>- [x] 2. Update miss-named classed on Maven examples
>
>### Reports :
>* 
>
>#### Steps to test and debugging:
>- [] 1.
>
>#### References :
>* []()
</details>

## 48-004
### Document the created containers ![status](https://img.shields.io/badge/status-DONE-brightgreen)
<details>
    <summary>Details</summary>

>The goal of this card is to fix some issues found on README.md and containers.
>
>### DOD  (definition of done):
>README is updated.
>All Container are fixed and updated
>
>### TODO :
>- [x] 1. Updated README with a link to this file DECK
>- [x] 2. Update miss-named classed on Maven examples
>
>### Reports :
>* 
>
>#### Steps to test and debugging:
>- [] 1.
>
>#### References :
>* []()
</details>

## 48-005
### Update README with a link to the spike ![status](https://img.shields.io/badge/status-DONE-brightgreen)
<details>
    <summary>Details</summary>

>The goal of this card is to update README to have a link to the spike that the container and codes are based.
>
>### DOD  (definition of done):
>README is updated.
>
>### TODO :
>- [x] 1. Updated README with a link to the spike file
>
>### Reports :
>* 
>
>#### Steps to test and debugging:
>- [] 1.
>
>#### References :
>* []()
</details>

# Stories/cards MD1 - Maintenance