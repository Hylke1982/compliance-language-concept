# Compliance language concept

A conceptual language focused on improving developer experience (DevEx) for DevOps teams. The idea is to create a 
language and a command line tool that can help teams to become compliant but also for teams that are responsible for 
compliance to have structured means of communicating that allows for automation and ease of use by a DevOps team.



## Disclaimer

**This is conceptual idea of a CLI and language (DSL) for compliance and is intended to inspire. This example has many 
technical limitations**

## Command line tool

The command line tool is a tool that would be distributed to DevOps teams is used for initialize, validate, check and 
upload proof of compliance.

## Example commands

Sample commands for the compliance command line tool


**Validate the syntax of a compliance file**
```bash
compliance validate --file product.compliance
```

**Check compliance**
```bash
compliance check --file product.compliance
```




