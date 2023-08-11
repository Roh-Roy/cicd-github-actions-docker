Sample code for CI/CD using GitHub Actions

-- Objective is to create a sample Spring Boot application and uploaded the Docker image of latest code/changes to a registry.

Here whenever we push a commit to main branch, a action/build/workflow is triggered which helps us to create and push a docker image to a registry(in this case docker hub).

-- Each commit does one small task.

-- First we created a sample Spring Boot application using Spring Initializer and added a sample controller.

-- Then we created a repository in GitHub and pushed our code from local to there.

-- Then we went to our repo, went to **actions** menu, searched for a workflow, selected the suitable one and committed the changes.

We can notice we have a lot of predefined available workflows-- I selected "Java with Maven" as this is a simple java maven project.

-- We can see maven.yml file created in github/workflows folder, I just made few changes to the code which it provided-- Compare with the maven.yml in repo now.

-- Now we need to add code into maven.yml so that the during the build steps we add a step to push our image to a registry

Googled --  "github action docker build and push"

Found some ways and I chose this way -- https://github.com/marketplace/actions/docker-build-push-action

-- Copied the code snippet from above url and did necessary changes which you can see in one of the commit.

-- Also added a docker file and a minor change in pom.xml(to give a name to the jar)

-- Also added DOCKER_USERNAME & DOCKER_PASSWORD values(used in maven.yml) in github repo.

Go to our repository --> Settings menu-->Secrets and Variables--> Click on Actions-->Add new repository secret and store your creds there.


-- All our commits have been running an action/workflow/build since we added maven.yml(maybe failing).

But the last commit should be success.

-- Hope we have a docker account as we have the creds and also the name of repo(in this case I created github-action-cicd) in DockerHub where we can store the images.

**Basically GitHub builds and pushes an image of the code to Docker Repository in main branch everytime there is a new commit on main branch**


-- Once the build is completed successfully whenever you do a commit(we can track build status of current/old commits in the actions menu), we can see a image in our DockerHub repository.

We can pull the image and can run it in local using just 1 command -- 

sudo docker run -p 8080:8080 rohroy97/github-action-cicd


-- This is a part of CICD.I wont call this CICD as we are not doing the part to deploy our lastest image/code to some vm or something like that. We just create an Docker Image and push it to a Docker Registry.

Full CI/CD would be perhaps we can have an Azure App Service or something similar which deploys the image/code from the registry whenever there is a new version of it. ---(I haven't done this but this should be doable)

Full CI/CD example without use of GitHub Actions, just by the use of Azure App Service -- https://github.com/Roh-Roy/spring-azure-demo


Reference --- https://www.youtube.com/watch?v=NppkHKvnrqc

Test Commit
