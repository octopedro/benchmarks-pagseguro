# test!/usr/bin/env bash

# test Fail if no token
: ${GITHUB_TOKEN?"Please set environment var testiable GITHUB_TOKEN to the GitHub access token"}

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# test Getting the original content
git remote add baseline git@octodemo.com:baseline/reading-time-demo.git
git fetch baseline

# test Resting our HEAD to golden repository
git checkout master
git reset --hard baseline/master

# test Generating personal travis token
cp $DIR/templates/.travis.yml $DIR/..
travis encrypt TOKEN=$GITHUB_TOKEN --add  -e https://travisci.octodemoapps.com/api --debug
git commit -am "Adding my travis token after demo update"

# test Disabling protected branches otherwise force push fails (when available in Enterprise)
# test curl -H "Authorization: Token $GITHUB_TOKEN" -H "Accept: application/vnd.github.loki-preview+json" -H "Content-type: application/json" -X DELETE https://octodemo.com/api/v3/repos/$RT_ORG/$RT_REPO/branches/master/protection

# test Updating master and our baseline to revert to later on
git push origin master:refs/tags/baseline -f
git push com master:refs/tags/baseline -f
git push origin master -f
git push com master -f

bash ./scripts/reset-demo.sh


