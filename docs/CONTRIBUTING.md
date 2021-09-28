# How to contribute

I'm really glad you're reading this, because we need developers to help this project come to fruition.

Here are some important resources:

  * [JIRA Tracker](https://s24srl.atlassian.net/secure/RapidBoard.jspa?projectKey=SUP) is our day-to-day project management space,
  * [Slack channel](https://s24devs.slack.com) is our real-time messaging platform.

## Testing

Every Pull Request needs to be tested to make sure that it works on the platform.

## Submitting changes

Please send a [GitHub Pull Request](https://github.com/everli/demand-utilities-v3/pulls) with a clear list of what you've done (read more about [pull requests](https://help.github.com/articles/about-pull-requests/)).
We can always use more test coverage. Please follow our coding conventions (below) and make sure all of your commits are atomic (one feature per commit).
When you want to introduce some feature AKA UserStory, please open a [GitHub Issue](https://github.com/everli/demand-utilities-v3/issues) and link this one to Jira.

### Step 1: Branch

Create a branch from `dev` and start hacking:

```text
$ git checkout -b my-branch -t origin/dev
```

### Step 2: Commit

Make sure git knows your name and email address:

```text
$ git config --global user.name "J. Random User"
$ git config --global user.email "j.random.user@example.com"
```

#### Commit message guidelines

Always write a clear log message for your commits.
One-line messages are fine for small changes, but bigger changes should look like this:

```text
$ git commit -m "controllers: a brief summary of the commit to this controller
>
> A paragraph describing what changed and its impact."
```

### Step 3: Landing

In order to land, a Pull Request needs to be reviewed and approved by at least one Collaborator and pass a CI (Continuous Integration.
After that, as long as there are no objections from a Collaborator, the Pull Request can be merged.

## Coding conventions

Start reading our code and you'll get the hang of it.
Please follow our [Code Guidelines](https://github.com/everli/code-guidelines).

Thanks
