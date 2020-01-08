#include<iostream>

using namespace std;
int dp[10][10];
int p[10][10];
int n;
void method();
int main()
{
	cin>>n;
	for(int i=1;i<n;i++)
		for(int j=i+1;j<=n;j++)
			cin>>p[i][j];

	method();

	for(int i=1;i<n;i++)
	{
		for(int j=2;j<=n;j++)
			cout<<dp[i][j]<<" ";
		cout<<endl;
	}

	return 0;
}

void method()
{
	for(int i=1;i<n;i++)
	{
		dp[i][i+1] = p[i][i+1];
	}
	for(int r=2;r<n;r++)
	{
		for(int i=1;i<n-r+1;i++)
		{
            int j=i+r;
			dp[i][j] = p[i][j];
			for(int k=i+1;k<j;k++)
			{
				if(dp[i][k]+dp[k][j]<dp[i][j])
					dp[i][j] = dp[i][k]+dp[k][j];
			}
		}
	}
}
