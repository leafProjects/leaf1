#!/bin/bash

if [[ $TRAVIS_COMMIT_MESSAGE == "RELEASE" ]] ; then

	curl -H "Authorization: token ${GITHUB_TOKEN}" -X POST \
	-d "{
	\"title\": \"Pull Request for commit ${TRAVIS_COMMIT} from ${TRAVIS_BRANCH} to master\",
	\"body\": \"Commit included into pull request ${TRAVIS_COMMIT_RANGE}\",
	\"head\": \"dev\",
	\"base\": \"master\"
	}" \
	"https://api.github.com/repos/${TRAVIS_REPO_SLUG}/pulls"

fi